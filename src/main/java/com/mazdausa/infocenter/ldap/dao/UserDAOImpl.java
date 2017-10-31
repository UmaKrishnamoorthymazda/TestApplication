package com.mazdausa.infocenter.ldap.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.naming.LimitExceededException;
import javax.naming.NameNotFoundException;
import javax.naming.NamingEnumeration;
import javax.naming.directory.BasicAttributes;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;

import org.apache.log4j.Logger;

import com.mazdausa.infocenter.ldap.command.LDAPException;
import com.mazdausa.infocenter.ldap.command.UserNotExistException;
import com.mazdausa.infocenter.ldap.domain.LDAPPerson;
import com.mazdausa.infocenter.ldap.domain.LDAPPersonImpl;
import com.mazdausa.infocenter.ldap.domain.LDAPUserAttribute;
import com.mazdausa.infocenter.ldap.domain.LDAPUserAttributeImpl;
import com.mazdausa.infocenter.ldap.domain.PersonAttributes;
import com.mazdausa.infocenter.ldap.util.PersonNameComparator;

public class UserDAOImpl implements UserDAO{
    
	private static final Logger logger = Logger.getLogger(UserDAOImpl.class);
    
    private static UserDAOImpl instance = new UserDAOImpl();
    
    private Properties env;

    
    public interface CustomFunctionInf
    {
        public void process(InitialDirContext context, String base, SearchControls constraints) throws Exception;
        
    }
    
    
    /**
     * RetrieveUser constructor comment.
     */
    private UserDAOImpl()
    {
        super();
    }

    public static UserDAOImpl getInstance()
    {
        return instance;
    }
    

    /**
     * Customized constructor to use an injected properties
     * @param ldapEnvProp
     * @return
     */
    public static UserDAOImpl getInstance(Properties ldapEnvProp)
    {
    	UserDAOImpl thisInstance = new UserDAOImpl();
    	thisInstance.env = ldapEnvProp;
    	return thisInstance;
    }

 
    
    protected void closeContext(InitialDirContext context)
    {
    	try
    	{
    		if(context != null)
    		{
    			context.close();
    		}
    	}
    	catch(Exception e)
    	{
    		
    	}
    }
    
    /**
     * Created:Nov 14, 2005
     * Author:Mike Vu
     * Method description:
     * 
     * 
     */
    private synchronized void init()
    {
        if(env == null)
            env = LDAPConfigImpl.getInstance().getConfigProp();
    }

    /**
     * Created:Nov 15, 2005
     * Author:Mike Vu
     * Method description:
     * 
     * @param context
     */
    protected void releaseContext(InitialDirContext context)
    {
        try
        {

           if(context != null)
           {
	                context.close();
        		}
        }
        catch(Exception e)
        {
           // log.error("releaseContext:Exception in attempting to close the InitialContext.");
        }
    }
    
    /**
     * Create and return new context
     * @return
     */
    protected InitialDirContext createNewContext() throws Exception
    {
    	if(env == null)
            init();
        InitialDirContext newCtx = new InitialDirContext(env);
        
        return newCtx;
    }
    
    
    /**
     * Created:Nov 15, 2005
     * Author:Mike Vu
     * Method description:
     * 
     * @return InitialDirContext or null
     */
    protected InitialDirContext getContext()
    {
        try
        {
        	//Implement the context pool here
        	return createNewContext();
        } 
       catch (Exception e)
        {
    	   e.printStackTrace();
          // log.error("Error in getting the directory context"+e);
           return null;
        }
    }
    
    /**
     * Created:Nov 9, 2005
     * Author:Mike Vu
     * Method description:
     * 
     * @param userID
     * @param aLdapPerson
     * @throws UserNotExistException
     * @throws LDAPException
     */
    public void populateUser(String userID, LDAPPerson ldapPerson) throws UserNotExistException, LDAPException    
    {
        LDAPPerson aLdapPerson = retrieveUser(userID);
        ((LDAPPersonImpl)ldapPerson).setAttributes(((LDAPPersonImpl)aLdapPerson).getAttributes());
    }
    
    
    public LDAPPerson retrieveUserUsingExistingContext(final InitialDirContext context,  String userID) throws UserNotExistException, LDAPException
    {
        LDAPPersonImpl aPerson = new LDAPPersonImpl();
        InitialDirContext ctx = null;
        try
        {

            String base = "ou=people,o=mazdausa";
            String filter = "(uid=" + userID + ")";
            SearchControls constraints = new SearchControls();
            constraints.setSearchScope(SearchControls.SUBTREE_SCOPE);
            
            NamingEnumeration results = context.search(base, filter, constraints);
            if (results.hasMoreElements())
            {
                while (results.hasMore())
                {
                    SearchResult sr = (SearchResult) results.next();
                    BasicAttributes attrs = (BasicAttributes) sr.getAttributes();
                    aPerson.setAttributes(attrs);
                }
            } else
            {
                //log.error("no such a person in LDAP: " + userID);
                throw new UserNotExistException();
            }
            return (LDAPPerson) aPerson;
        } catch (javax.naming.NameNotFoundException ex)
        {
            //log.error("Retrieve user from LDAP error: " + aPerson.getAttributes().get("uid") + ". exception: " + ex.toString());
            throw new UserNotExistException();
        } catch (javax.naming.NamingException ex)
        {
            //log.error("Retrieve user from LDAP with LDAP failure error." + ex.toString());
            throw new LDAPException();
        }
        catch(Exception e)
        {
            //log.error("Retrieve user from LDAP with LDAP failure error." + e.toString());
            throw new LDAPException();
        }
        finally
        {
           logger.info("Got ldap user" + aPerson);         
        }
    }
    
    
    
    /**
     * Retrieve Users Object from LDAP by userid This user could be inactive Creation date: (3/13/2001 8:42:56 PM)
     * 
     * @param req
     *            javax.servlet.ServletRequest
     */
    public LDAPPerson retrieveUser(String userID) throws UserNotExistException, LDAPException
    {
        LDAPPersonImpl aPerson = new LDAPPersonImpl();
        InitialDirContext ctx = null;
        try
        {

            String base = "ou=people,o=mazdausa";
            String filter = "(uid=" + userID + ")";
            SearchControls constraints = new SearchControls();
            constraints.setSearchScope(SearchControls.SUBTREE_SCOPE);
            
            NamingEnumeration results = getContext().search(base, filter, constraints);
            if (results.hasMoreElements())
            {
                while (results.hasMore())
                {
                    SearchResult sr = (SearchResult) results.next();
                    BasicAttributes attrs = (BasicAttributes) sr.getAttributes();
                    aPerson.setAttributes(attrs);
                }
            } else
            {
                ////log.error("no such a person in LDAP: " + userID);
                throw new UserNotExistException();
            }
            return (LDAPPerson) aPerson;
        } catch (javax.naming.NameNotFoundException ex)
        {
            //log.error("Retrieve user from LDAP error: " + aPerson.getAttributes().get("uid") + ". exception: " + ex.toString());
            throw new UserNotExistException();
        } catch (javax.naming.NamingException ex)
        {
            //log.error("Retrieve user from LDAP with LDAP failure error." + ex.toString());
            throw new LDAPException();
        }
        catch(Exception e)
        {
            //log.error("Retrieve user from LDAP with LDAP failure error." + e.toString());
            throw new LDAPException();
        }
        finally
        {
            releaseContext(ctx);            
        }
    }

    /**
     * Insert the method's description here. Creation date: (6/26/2002 7:34:33 AM)
     * 
     * @return java.lang.String
     * @param loctCd
     *            java.lang.String
     */
    public String getLoctNm(String loctnCode) throws LDAPException
    {
        InitialDirContext ctx = null;
        try
        {

            String base = "ou=people,o=mazdausa";
            String filter = "(&(loctnCd=" + loctnCode + ")(prsnStatusCd=A))";
            SearchControls constraints = new SearchControls();
            constraints.setSearchScope(SearchControls.SUBTREE_SCOPE);
            NamingEnumeration results = getContext().search(base, filter, constraints);
            if (results.hasMoreElements())
            {
                LDAPPersonImpl aLdapPerson = new LDAPPersonImpl();
                SearchResult sr = (SearchResult) results.next();
                aLdapPerson.setAttributes((BasicAttributes) sr.getAttributes());
                 
                return aLdapPerson.getAttributes().get("loctnNm").get().toString();
            } else
            {
                 
                return "NoSuchLocation";
            }
        } catch (javax.naming.LimitExceededException ex)
        {
            //log.error("Retrieve users from LDAP error." + ex.toString());
            throw new LDAPException();
        } catch (javax.naming.NameNotFoundException ex)
        {
            //log.error("Retrieve users from LDAP error." + ex.toString());
            throw new LDAPException();
        } catch (javax.naming.NamingException ex)
        {
            //log.error("Retrieve users from LDAP error." + ex.toString());
            throw new LDAPException();
        }
        catch(Exception e)
        {
            //log.error("Retrieve user from LDAP with LDAP failure error." + e.toString());
            throw new LDAPException();
        }
        finally
        {
            releaseContext(ctx);            
        }
        
    }

    /**
     * Insert the method's description here. Creation date: (9/27/2001 1:46:08 PM)
     * 
     * @return boolean
     * @param aPerson
     *            com.mazdausa.common.wsl.model.LDAPPerson
     */
    protected boolean personIsActive(LDAPPersonImpl aPerson)
    {
        if (aPerson.isActive())
            return true;
        else
            return false;
    }

    /**
     * Retrieve Active Users Object from LDAP base on the following criteria: user id, first name, last name, primary job code, secondary job code Creation date: (4/10/01 9:27:07 AM)
     * 
     * @return java.util.Iterator
     * @param param
     *            java.lang.String
     */
    public Iterator retrieveActivePersonsUsingCriteria(String param) throws LimitExceededException, LDAPException, UserNotExistException
    {
        InitialDirContext ctx = null;
        try
        {

            String base = "ou=people,o=mazdausa";
            StringBuffer filter = new StringBuffer();
            filter.append("(&(|(prsnStatusCd=A)(prsnStatusCd=R))(|(sn=");
            filter.append(param);
            filter.append(")(loctnCd=");
            filter.append(param);
            filter.append(")))");
            SearchControls constraints = new SearchControls();
            constraints.setSearchScope(SearchControls.SUBTREE_SCOPE);
            NamingEnumeration results = getContext().search(base, filter.toString(), constraints);
            SortedSet persons = new TreeSet(new PersonNameComparator());
            if (results.hasMoreElements())
            {
                while (results.hasMore())
                {
                    SearchResult sr = (SearchResult) results.next();
                    BasicAttributes attrs = (BasicAttributes) sr.getAttributes();
                    LDAPPersonImpl aLdapPerson = new LDAPPersonImpl();
                    aLdapPerson.setAttributes(attrs);
                    persons.add((LDAPPerson) aLdapPerson);
                }
            }
             
            return persons.iterator();
        } catch (javax.naming.LimitExceededException ex)
        {
            //log.error("*** Return records exceed limitation: " + ex.toString());
            throw new LimitExceededException();
        } catch (javax.naming.NameNotFoundException ex)
        {
            //log.error("*** Retrieve user from LDAP error: " + ex.toString());
            throw new UserNotExistException();
        } catch (javax.naming.NamingException ex)
        {
            //log.error(Calendar.getInstance().getTime().toString() + " RetrieveUserBroker.retrievePersonsUsingCriteria() encountered exception::" + ex.toString());
            throw new LDAPException(ex.getMessage());
        }
        catch(Exception e)
        {
            //log.error("Retrieve user from LDAP with LDAP failure error." + e.toString());
            throw new LDAPException();
        }
        finally
        {
            releaseContext(ctx);            
        }
        
    }

    public void populateActiveUser(String userID, LDAPPerson ldapPerson) throws UserNotExistException, LDAPException
    {
        LDAPPerson aLdapPerson = retrieveActiveUser(userID);
        ((LDAPPersonImpl)ldapPerson).setAttributes(((LDAPPersonImpl)aLdapPerson).getAttributes());
    }
    
    /**
     * Retrieve Active Users Object from LDAP by userid Creation date: (3/13/2001 8:42:56 PM)
     * 
     * @param req
     *            javax.servlet.ServletRequest
     */
    public LDAPPerson retrieveActiveUser(String userID) throws UserNotExistException, LDAPException
    {
        InitialDirContext ctx = null;
        LDAPPersonImpl aPerson = new LDAPPersonImpl();
        try
        {
        	
    		
    		
    		
        	String base = "ou=people,o=mazdausa";
            String filter = "(&(uid=" + userID + ")(|(prsnStatusCd=A)(prsnStatusCd=R)))";
            SearchControls constraints = new SearchControls();
            constraints.setSearchScope(SearchControls.SUBTREE_SCOPE);
            ctx = getContext();
            NamingEnumeration results = ctx.search(base, filter, constraints);
            if (results.hasMoreElements())
            {
                while (results.hasMore())
                {
                    SearchResult sr = (SearchResult) results.next();
                    BasicAttributes attrs = (BasicAttributes) sr.getAttributes();
                    aPerson.setAttributes(attrs);
                }
            } else
            {
                //log.error("no such a person in LDAP: " + userID);
                throw new UserNotExistException();
            }
             
            return (LDAPPerson) aPerson;
        } catch (javax.naming.NameNotFoundException ex)
        {
            //log.error("*** Retrieve user from LDAP error: " + aPerson.getAttributes().get("uid") + ". exception: " + ex.toString());
            throw new UserNotExistException();
        } catch (javax.naming.NamingException ex)
        {
            //log.error("*** Retrieve user from LDAP with LDAP failure error." + ex.toString());
            throw new LDAPException();
        }
        catch(Exception e)
        {
            //log.error("Retrieve user from LDAP with LDAP failure error." + e.toString());
            throw new LDAPException();
        }
        finally
        {
            releaseContext(ctx);            
        }
        
    }

    /**
     * Insert the method's description here. Creation date: (8/16/2002 11:40:58 AM)
     * 
     * @return javax.naming.directory.BasicAttributes
     * @param uid
     *            java.lang.String
     */
    public LDAPUserAttribute retrieveActiveUserAttributes(String userID) throws UserNotExistException, LDAPException
    {
        InitialDirContext ctx = null;
        LDAPUserAttributeImpl userAttr = new LDAPUserAttributeImpl();
        try
        {
            String base = "ou=people,o=mazdausa";
            String filter = "(&(uid=" + userID + ")(|(prsnStatusCd=A)(prsnStatusCd=R)))";
            SearchControls constraints = new SearchControls();
            constraints.setSearchScope(SearchControls.SUBTREE_SCOPE);
            ctx = getContext();
            NamingEnumeration results = ctx.search(base, filter, constraints);
            if (results.hasMoreElements())
            {
                while (results.hasMore())
                {
                    SearchResult sr = (SearchResult) results.next();
                    userAttr.setAttributes((BasicAttributes) sr.getAttributes());
                }
            } else
            {
                //log.error("no such a person in LDAP: " + userID);
                throw new UserNotExistException();
            }
             
            return (LDAPUserAttribute) userAttr;
        } catch (javax.naming.NameNotFoundException ex)
        {
            //log.error("*** Retrieve user from LDAP error: " + userID + ". exception: " + ex.toString());
            throw new UserNotExistException();
        } catch (javax.naming.NamingException ex)
        {
            //log.error("*** Retrieve user from LDAP with LDAP failure error." + ex.toString());
            throw new LDAPException();
        }
        catch(Exception e)
        {
            //log.error("Retrieve user from LDAP with LDAP failure error." + e.toString());
            throw new LDAPException();
        }
        finally
        {
            releaseContext(ctx);            
        }
        
    }

    
    /**
     * Created:Nov 9, 2005
     * Author:Mike Vu
     * Method description:
     * 
     * @param ssn
     * @param aLdapPerson
     * @throws LDAPException
     * @throws UserNotExistException
     */
    public void populateActiveUserBySSN(String ssn, LDAPPerson aLdapPerson) throws LDAPException, UserNotExistException
    {
        aLdapPerson = retrieveActiveUserBySSN(ssn);
    }
    
    /**
     * Insert the method's description here. Creation date: (8/22/2002 8:40:05 AM)
     * 
     * @return com.mazdausa.common.ldap.model.LDAPPerson
     * @param ssn
     *            java.lang.String
     * @exception com.mazdausa.common.ldap.brokers.LDAPException
     *                The exception description.
     * @exception com.mazdausa.common.ldap.brokers.UserNotExistException
     *                The exception description.
     */
    public LDAPPerson retrieveActiveUserBySSN(String ssn) throws LDAPException, UserNotExistException
    {
        InitialDirContext ctx = null;
        LDAPPersonImpl aPerson = new LDAPPersonImpl();
        try
        {
            String base = "ou=people,o=mazdausa";
            String filter = "(&(employeeNumber=" + ssn + ")(|(prsnStatusCd=A)(prsnStatusCd=R)))";
            SearchControls constraints = new SearchControls();
            constraints.setSearchScope(SearchControls.SUBTREE_SCOPE);
            ctx = getContext();
            NamingEnumeration results = ctx.search(base, filter, constraints);
            if (results.hasMoreElements())
            {
                while (results.hasMore())
                {
                    SearchResult sr = (SearchResult) results.next();
                    BasicAttributes attrs = (BasicAttributes) sr.getAttributes();
                    aPerson.setAttributes(attrs);
                }
            } else
            {
                //log.error("no such a person in LDAP: " + ssn);
                throw new UserNotExistException();
            }
             
            return (LDAPPerson) aPerson;
        } catch (javax.naming.NameNotFoundException ex)
        {
            //log.error("*** Retrieve user from LDAP error: " + aPerson.getAttributes().get("uid") + ". exception: " + ex.toString());
            throw new UserNotExistException();
        } catch (javax.naming.NamingException ex)
        {
            //log.error("*** Retrieve user from LDAP with LDAP failure error." + ex.toString());
            throw new LDAPException();
        }
        catch(Exception e)
        {
            //log.error("Retrieve user from LDAP with LDAP failure error." + e.toString());
            throw new LDAPException();
        }
        finally
        {
            releaseContext(ctx);            
        }

    }

    /**
     * retrieve Dealer persons.
     * 
     * @param dealerCode
     *            java.lang.String return Hashtable with collection of dealer persons in LDAP person format. Creation date: (3/21/2001 10:11:12 AM)
     */
    public Map retrieveActiveUsersFromLoctn(String loctnCode) throws NameNotFoundException, LimitExceededException, LDAPException
    {
        InitialDirContext ctx = null;
        Map persons = new HashMap();
        try
        {
            String base = "ou=people,o=mazdausa";
            String filter = "(&(loctnCd=" + loctnCode + ")(|(prsnStatusCd=A)(prsnStatusCd=R)))";
            SearchControls constraints = new SearchControls();
            constraints.setSearchScope(SearchControls.SUBTREE_SCOPE);
            ctx = getContext();
            NamingEnumeration results = ctx.search(base, filter, constraints);
            if (results.hasMoreElements())
            {
                while (results.hasMore())
                {
                    LDAPPersonImpl aLdapPerson = new LDAPPersonImpl();
                    SearchResult sr = (SearchResult) results.next();
                    BasicAttributes attrs = (BasicAttributes) sr.getAttributes();
                    aLdapPerson.setAttributes(attrs);
                    persons.put(sr.getName(), (LDAPPerson) aLdapPerson);
                }
            }
             
            return persons;
        } catch (javax.naming.LimitExceededException ex)
        {
            //log.error("Retrieve users from LDAP error." + ex.toString());
            throw new LimitExceededException();
        } catch (javax.naming.NameNotFoundException ex)
        {
            //log.error("Retrieve users from LDAP error." + ex.toString());
            throw new NameNotFoundException();
        } catch (javax.naming.NamingException ex)
        {
            //log.error("Retrieve users from LDAP error." + ex.toString());
            throw new LDAPException();
        }
        catch(Exception e)
        {
            //log.error("Retrieve user from LDAP with LDAP failure error." + e.toString());
            throw new LDAPException();
        }
        finally
        {
            releaseContext(ctx);            
        }
        
    }

    /**
     * Retrieve All Users Object from LDAP base on the following criteria: user id, first name, last name, primary job code, secondary job code Creation date: (4/10/01 9:27:07 AM)
     * 
     * @return java.util.Iterator
     * @param param
     *            java.lang.String
     */
    public Iterator retrievePersonsUsingCriteria(String param) throws LimitExceededException, LDAPException, UserNotExistException
    {
        InitialDirContext ctx = null;
        try
        {
            String base = "ou=people,o=mazdausa";
            StringBuffer filter = new StringBuffer();
            filter.append("(|(sn=");
            filter.append(param);
            filter.append(")(loctnCd=");
            filter.append(param);
            filter.append("))");
            SearchControls constraints = new SearchControls();
            constraints.setSearchScope(SearchControls.SUBTREE_SCOPE);
            ctx = getContext();
            NamingEnumeration results = ctx.search(base, filter.toString(), constraints);
            SortedSet persons = new TreeSet(new com.mazdausa.infocenter.ldap.util.PersonNameComparator());
            if (results.hasMoreElements())
            {
                while (results.hasMore())
                {
                    SearchResult sr = (SearchResult) results.next();
                    BasicAttributes attrs = (BasicAttributes) sr.getAttributes();
                    LDAPPersonImpl aLdapPerson = new LDAPPersonImpl();
                    aLdapPerson.setAttributes(attrs);
                    persons.add((LDAPPerson) aLdapPerson);
                }
            }
             
            return persons.iterator();
        } catch (javax.naming.LimitExceededException ex)
        {
            //log.error("*** Return records exceed limitation: " + ex.toString());
            throw new LimitExceededException();
        } catch (javax.naming.NameNotFoundException ex)
        {
            //log.error("*** Retrieve user from LDAP error: " + ex.toString());
            throw new UserNotExistException();
        } catch (javax.naming.NamingException ex)
        {
            //log.error(Calendar.getInstance().getTime().toString() + " RetrieveUserBroker.retrievePersonsUsingCriteria() encountered exception::" + ex.toString());
            throw new LDAPException(ex.getMessage());
        }
        catch(Exception e)
        {
           // log.error("Retrieve user from LDAP with LDAP failure error." + e.toString());
            throw new LDAPException();
        }
        finally
        {
            releaseContext(ctx);            
        }

        
    }

    public Iterator runQuery(String query) throws LimitExceededException, LDAPException, UserNotExistException
    {
        InitialDirContext ctx = null;
        List rowList = new ArrayList();
        try
        {
            String base = "ou=people,o=mazdausa";
            StringBuffer filter = new StringBuffer();
            filter.append(query);
            SearchControls constraints = new SearchControls();
            constraints.setSearchScope(SearchControls.SUBTREE_SCOPE);
            ctx = getContext();
            NamingEnumeration results = ctx.search(base, filter.toString(), constraints);
            
            if (results.hasMoreElements())
            {
                while (results.hasMore())
                {
                    SearchResult sr = (SearchResult) results.next();
                    BasicAttributes attrs = (BasicAttributes) sr.getAttributes();
                    rowList.add(new PersonAttributes(attrs));
                }
            }
             
            return rowList.iterator();
        } catch (javax.naming.LimitExceededException ex)
        {
            //log.error("*** Return records exceed limitation: " + ex.toString());
            throw new LimitExceededException();
        } catch (javax.naming.NameNotFoundException ex)
        {
            //log.error("*** Retrieve user from LDAP error: " + ex.toString());
            throw new UserNotExistException();
        } catch (javax.naming.NamingException ex)
        {
            //log.error(Calendar.getInstance().getTime().toString() + " RetrieveUserBroker.retrievePersonsUsingCriteria() encountered exception::" + ex.toString());
            throw new LDAPException(ex.getMessage());
        }
        catch(Exception e)
        {
            //log.error("Retrieve user from LDAP with LDAP failure error." + e.toString());
            throw new LDAPException();
        }
        finally
        {
            releaseContext(ctx);            
        }

        
    }

    
    
    /**
     * Insert the method's description here. Creation date: (3/21/2002 8:50:33 AM)
     * 
     * @return java.util.Hashtable
     * @param loctnCode
     *            java.lang.String
     * @exception com.mazdausa.common.ldap.brokers.LDAPException
     *                The exception description.
     */
    public Map retrieveUsersFromLoctn(String loctnCode) throws LDAPException
    {
        InitialDirContext ctx = null;
        Map persons = new HashMap();
        try
        {
            String base = "ou=people,o=mazdausa";
            String filter = "(loctnCd=" + loctnCode + ")";
            SearchControls constraints = new SearchControls();
            constraints.setSearchScope(SearchControls.SUBTREE_SCOPE);
            ctx = getContext();
            NamingEnumeration results = ctx.search(base, filter, constraints);
            if (results.hasMoreElements())
            {
                while (results.hasMore())
                {
                    LDAPPersonImpl aLdapPerson = new LDAPPersonImpl();
                    SearchResult sr = (SearchResult) results.next();
                    BasicAttributes attrs = (BasicAttributes) sr.getAttributes();
                    aLdapPerson.setAttributes(attrs);
                    persons.put(sr.getName(), (LDAPPerson) aLdapPerson);
                }
            }
             
            return persons;
        } catch (javax.naming.LimitExceededException ex)
        {
            //log.error("Retrieve users from LDAP error." + ex.toString());
            throw new LDAPException();
        } catch (javax.naming.NameNotFoundException ex)
        {
            //log.error("Retrieve users from LDAP error." + ex.toString());
            throw new LDAPException();
        } catch (javax.naming.NamingException ex)
        {
            //log.error("Retrieve users from LDAP error." + ex.toString());
            throw new LDAPException();
        }
        catch(Exception e)
        {
            //log.error("Retrieve user from LDAP with LDAP failure error." + e.toString());
            throw new LDAPException();
        }
        finally
        {
            releaseContext(ctx);            
        }
        
    }
    
    /**
     * Custom extension
    * This method overrides super class
    * @see super class
     */
    public void customFunction(CustomFunctionInf customFuncInf) throws LDAPException
    {
        InitialDirContext ctx = null;
        Map persons = new HashMap();
        try
        {
            String base = "ou=people,o=mazdausa";

            SearchControls constraints = new SearchControls();
            constraints.setSearchScope(SearchControls.SUBTREE_SCOPE);
            ctx = getContext();
            
            //Call extension
            customFuncInf.process(ctx,base,constraints);
            
            
        } 
        catch(Exception e)
        {
           // log.error("Custom extension failed with exception." + e);
            throw new LDAPException(e.getMessage());
        }
        finally
        {
            releaseContext(ctx);            
        }
        
    }
    
}