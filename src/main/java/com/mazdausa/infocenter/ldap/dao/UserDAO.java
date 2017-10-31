package com.mazdausa.infocenter.ldap.dao;

import java.util.Iterator;
import java.util.Map;

import javax.naming.LimitExceededException;
import javax.naming.NameNotFoundException;


import com.mazdausa.infocenter.ldap.command.LDAPException;
import com.mazdausa.infocenter.ldap.command.UserNotExistException;
import com.mazdausa.infocenter.ldap.domain.LDAPPerson;
import com.mazdausa.infocenter.ldap.domain.LDAPUserAttribute;



public interface UserDAO
{
    /**
     * Retrieve Users Object from LDAP by userid This user could be inactive Creation date: (3/13/2001 8:42:56 PM)
     * 
     * @param req
     *            javax.servlet.ServletRequest
     */
    public abstract LDAPPerson retrieveUser(String userID) throws UserNotExistException, LDAPException;

    /**
     * Insert the method's description here. Creation date: (6/26/2002 7:34:33 AM)
     * 
     * @return java.lang.String
     * @param loctCd
     *            java.lang.String
     */
    public abstract String getLoctNm(String loctnCode) throws LDAPException;

    /**
     * Retrieve Active Users Object from LDAP base on the following criteria: user id, first name, last name, primary job code, secondary job code Creation date: (4/10/01 9:27:07 AM)
     * 
     * @return java.util.Iterator
     * @param param
     *            java.lang.String
     */
    public abstract Iterator retrieveActivePersonsUsingCriteria(String param) throws LimitExceededException, LDAPException, UserNotExistException;

    /**
     * Retrieve Active Users Object from LDAP by userid Creation date: (3/13/2001 8:42:56 PM)
     * 
     * @param req
     *            javax.servlet.ServletRequest
     */
    public abstract LDAPPerson retrieveActiveUser(String userID) throws UserNotExistException, LDAPException;

    /**
     * Insert the method's description here. Creation date: (8/16/2002 11:40:58 AM)
     * 
     * @return javax.naming.directory.BasicAttributes
     * @param uid
     *            java.lang.String
     */
    public abstract LDAPUserAttribute retrieveActiveUserAttributes(String userID) throws UserNotExistException, LDAPException;

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
    public abstract LDAPPerson retrieveActiveUserBySSN(String ssn) throws LDAPException, UserNotExistException;

    /**
     * retrieve Dealer persons.
     * 
     * @param dealerCode
     *            java.lang.String return Hashtable with collection of dealer persons in LDAP person format. Creation date: (3/21/2001 10:11:12 AM)
     */
    public abstract Map retrieveActiveUsersFromLoctn(String loctnCode) throws NameNotFoundException, LimitExceededException, LDAPException;

    /**
     * Retrieve All Users Object from LDAP base on the following criteria: user id, first name, last name, primary job code, secondary job code Creation date: (4/10/01 9:27:07 AM)
     * 
     * @return java.util.Iterator
     * @param param
     *            java.lang.String
     */
    public abstract Iterator retrievePersonsUsingCriteria(String param) throws LimitExceededException, LDAPException, UserNotExistException;

    /**
     * Insert the method's description here. Creation date: (3/21/2002 8:50:33 AM)
     * 
     * @return java.util.Hashtable
     * @param loctnCode
     *            java.lang.String
     * @exception com.mazdausa.common.ldap.brokers.LDAPException
     *                The exception description.
     */
    public abstract Map retrieveUsersFromLoctn(String loctnCode) throws LDAPException;
    
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
    public void populateActiveUser(String userID, LDAPPerson aLdapPerson) throws UserNotExistException, LDAPException;
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
    public void populateActiveUserBySSN(String ssn, LDAPPerson aLdapPerson) throws LDAPException, UserNotExistException;
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
    public void populateUser(String userID, LDAPPerson aLdapPerson) throws UserNotExistException, LDAPException;
    
    
    public Iterator runQuery(String query) throws LimitExceededException, LDAPException, UserNotExistException;
}