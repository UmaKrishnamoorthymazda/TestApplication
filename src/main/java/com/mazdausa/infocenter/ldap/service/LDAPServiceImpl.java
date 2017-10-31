package com.mazdausa.infocenter.ldap.service;

import java.util.Iterator;
import java.util.Map;

import org.apache.log4j.Logger;

import com.mazdausa.infocenter.ldap.command.CommandException;
import com.mazdausa.infocenter.ldap.command.LDAPException;
import com.mazdausa.infocenter.ldap.command.LDAPExceptionHandler;
import com.mazdausa.infocenter.ldap.dao.UserDAOImpl;
import com.mazdausa.infocenter.ldap.domain.LDAPPerson;
import com.mazdausa.infocenter.ldap.domain.LDAPUserAttribute;


public class LDAPServiceImpl
{

	private static final Logger logger = Logger.getLogger(LDAPServiceImpl.class);

	private static LDAPServiceImpl _instance = new LDAPServiceImpl();
	/**
	 * RetrieveUserBroker constructor comment.
	 */
	public LDAPServiceImpl()
	{
		super();
	}

	public static LDAPServiceImpl getInstance()
	{
		return _instance;
	}

	//Business methods
	/**
	 * Created:Nov 3, 2005 Author:Mike Vu Method description: Retrive the person attribute
	 * 
	 * @param userId
	 * @return
	 * @throws CommandException
	 */
	public LDAPUserAttribute findActiveUserAttributes(String userId) throws CommandException
	{
		LDAPExceptionHandler.handleNullParam(userId);

		logger.debug("The user attributes passed based on userId"+userId);

		try
		{
			return getLDAPDAO().retrieveActiveUserAttributes(userId);
		}
		catch (Exception e)
		{
			logger.error("ldap findActiveUserAttributes;");
			LDAPExceptionHandler.handleException(e);
			return null;
		}
	}


	/**
	 * Created:Nov 3, 2005
	 * Author:Mike Vu
	 * Method description:
	 * 
	 * @param ssn
	 * @return
	 * @throws CommandException
	 */
	public LDAPPerson findActiveUserBySSN(String ssn) throws CommandException
	{
		LDAPExceptionHandler.handleNullParam(ssn);

		try
		{
			return getLDAPDAO().retrieveActiveUserBySSN(ssn);
		}
		catch (Exception e)
		{
			logger.error("ldap findActiveUserBySSN;");
			LDAPExceptionHandler.handleException(e);
			return null;
		}
	}

	/**
	 * Created:Nov 3, 2005
	 * Author:Mike Vu
	 * Method description:
	 * 
	 * @param userId
	 * @return
	 * @throws CommandException
	 */
	public LDAPPerson findActiveUserByUserId(String userId) throws CommandException
	{
		LDAPExceptionHandler.handleNullParam(userId);

		try
		{
			return getLDAPDAO().retrieveActiveUser(userId);
		}
		catch (Exception e)
		{
			logger.error("ldap findActiveUserByUserId;");
			LDAPExceptionHandler.handleException(e);
			return null;
		}
	}

	/**
	 * Return the list of persons from the LDAP matching the criteria
	 * @param surName
	 * @return
	 * @throws CommandException
	 */
	public Iterator findUsers(String surName) throws CommandException
	{
		LDAPExceptionHandler.handleNullParam(surName);

		try
		{
			return getLDAPDAO().retrievePersonsUsingCriteria(surName);
		}
		catch (Exception e)
		{
			logger.error("ldap findUsers;");
			LDAPExceptionHandler.handleException(e);
			return null;
		}
	}
	/**
	 * Created:Nov 3, 2005
	 * Author:Mike Vu
	 * Method description:
	 * 
	 * @param surName
	 * @return
	 * @throws CommandException
	 */
	public Iterator findActiveUsers(String surName) throws CommandException
	{
		LDAPExceptionHandler.handleNullParam(surName);

		try
		{
			return getLDAPDAO().retrieveActivePersonsUsingCriteria(surName);
		}
		catch (Exception e)
		{
			logger.error("ldap findActiveUsers;");
			LDAPExceptionHandler.handleException(e);
			return null;
		}
	}


	/**
	 * Created:Nov 3, 2005
	 * Author:Mike Vu
	 * Method description:
	 * 
	 * @param locationCode
	 * @return
	 * @throws CommandException
	 */
	public Map findActiveUsersFromLocation(String locationCode) throws CommandException
	{
		LDAPExceptionHandler.handleNullParam(locationCode);

		try
		{
			return getLDAPDAO().retrieveActiveUsersFromLoctn(locationCode);
		}
		catch (Exception e)
		{
			logger.error("ldap findActiveUsersFromLocation;");
			LDAPExceptionHandler.handleException(e);
			return null;
		}
	}

	/**
	 * Created:Nov 3, 2005
	 * Author:Mike Vu
	 * Method description:
	 * 
	 * @param surName
	 * @return
	 * @throws CommandException
	 */
	public String findLocationNam(String locationCode) throws CommandException
	{
		LDAPExceptionHandler.handleNullParam(locationCode);

		try
		{
			return getLDAPDAO().getLoctNm(locationCode);
		}
		catch (Exception e)
		{
			logger.error("ldap findLocationNam;");
			LDAPExceptionHandler.handleException(e);
			return null;
		}
	}




	/**
	 * Created:Nov 3, 2005
	 * Author:Mike Vu
	 * Method description:
	 * 
	 * @param employeeId
	 * @param locationCode
	 * @param jobCode
	 * @return
	 * @throws CommandException
	 */
	public Iterator findActiveUserByEmployeeID(String employeeId, String locationCode, String jobCode) throws CommandException
	{
		LDAPExceptionHandler.handleNullParam(employeeId);
		LDAPExceptionHandler.handleNullParam(locationCode);
		LDAPExceptionHandler.handleNullParam(jobCode);

		try
		{
			java.util.SortedSet persons = new java.util.TreeSet(new com.mazdausa.infocenter.ldap.util.PersonNameComparator());
			java.util.Iterator personList = getLDAPDAO().retrievePersonsUsingCriteria(locationCode);
			while (personList.hasNext()) 
			{
				LDAPPerson aPerson = (LDAPPerson) personList.next();
				if (employeeId.equalsIgnoreCase(aPerson.getDealerEmpCd())) 
				{
					if (jobCode.equalsIgnoreCase(aPerson.getPrimJobCd()) || jobCode.equalsIgnoreCase(aPerson.getSecJobCd1()) || jobCode.equalsIgnoreCase(aPerson.getSecJobCd2()) || jobCode.equalsIgnoreCase(aPerson.getSecJobCd3()))
						persons.add(aPerson);
				}
			}
			return persons.iterator();
		}
		catch(Exception e)
		{
			logger.error("ldap findActiveUserByEmployeeID;");
			LDAPExceptionHandler.handleException(e);
			return null;
		}
	}    /**
	 * Created:Nov 3, 2005 Author:Mike Vu Method description:
	 * 
	 * @param userId
	 * @return
	 * @throws CommandException
	 */
	public LDAPPerson findUser(String userId) throws CommandException
	{
		LDAPExceptionHandler.handleNullParam(userId);

		try
		{
			return getLDAPDAO().retrieveUser(userId);
		}
		catch (Exception e)
		{
			logger.error("ldap findUser;");
			LDAPExceptionHandler.handleException(e);
			return null;
		}
	}


	/**
	 * Created:Nov 3, 2005
	 * Author:Mike Vu
	 * Method description:
	 * 
	 * @param locationCode
	 * @param employeeId
	 * @return
	 * @throws CommandException
	 */
	public Iterator findUserByEmployeeID(String locationCode, String employeeId) throws CommandException
	{

		LDAPExceptionHandler.handleNullParam(locationCode);
		LDAPExceptionHandler.handleNullParam(employeeId);

		try
		{
			java.util.SortedSet persons = new java.util.TreeSet(new com.mazdausa.infocenter.ldap.util.PersonNameComparator());
			java.util.Iterator personList = getLDAPDAO().retrievePersonsUsingCriteria(locationCode);
			while (personList.hasNext())
			{
				LDAPPerson aPerson = (LDAPPerson) personList.next();
				if (employeeId.equalsIgnoreCase(aPerson.getDealerEmpCd()))
				{
					persons.add(aPerson);
				}
			}
			return persons.iterator();
		}
		catch (Exception e)
		{
			logger.error("ldap findUserByEmployeeID;");
			LDAPExceptionHandler.handleException(e);
			return null;
		}
	}


	/**
	 * Created:Nov 3, 2005
	 * Author:Mike Vu
	 * Method description:
	 * 
	 * @param searchCriteria
	 * @param dlrCode
	 * @param argumentDate
	 * @return
	 * @throws CommandException
	 */
	public Iterator findUserByTermDate(String searchCriteria, String dlrCode, java.util.Date termDate) throws CommandException
	{
		LDAPExceptionHandler.handleNullParam(searchCriteria);
		LDAPExceptionHandler.handleNullParam(dlrCode);
		LDAPExceptionHandler.handleNullParam(termDate);

		java.util.SortedSet persons = new java.util.TreeSet(new com.mazdausa.infocenter.ldap.util.PersonNameComparator());
		try
		{
			Map tb = getLDAPDAO().retrieveUsersFromLoctn(dlrCode);
			Iterator iter = tb.values().iterator();
			while (iter.hasNext())
			{
				LDAPPerson aPerson = (LDAPPerson) iter.next();
				// empty search criteria string || Dealer Person Employee ID matched || Last name matched
				if ("".equalsIgnoreCase(searchCriteria) || searchCriteria.equalsIgnoreCase(aPerson.getDealerEmpCd()) || searchCriteria.equalsIgnoreCase(aPerson.getLastName()))
				{
					com.mazdausa.infocenter.ldap.util.ConvertUtil convert = new com.mazdausa.infocenter.ldap.util.ConvertUtil();
					java.util.Date personHireDate = convert.stringToDate(aPerson.getHireDt());
					// Dealer Person HireDate on or before argumentDate (Not After)
					if (!personHireDate.after(termDate))
					{
						// Dealer Person Termination Date is not null
						if (!"0001-01-01".equals(aPerson.getTrmntnDt()))
						{
							java.util.Date personTermDate = convert.stringToDate(aPerson.getTrmntnDt());
							// Dealer Person Termination Date ON or AFTER the argumentDate. (Not Before)
							if (!personTermDate.before(termDate))
							{
								persons.add(aPerson);
							}
							// if Dealer Person Termination Date is null
						} else
						{
							if (aPerson.isActive())
								persons.add(aPerson);
						}
					}
				}
			}
			return persons.iterator();
		} catch (LDAPException ex)
		{
			logger.error("ldap termdate;");
			LDAPExceptionHandler.handleException(ex);
			return null;
		}
	}


	/**
	 * Created:Nov 3, 2005 Author:Mike Vu Method description:
	 * 
	 * @return
	 */
	protected UserDAOImpl getLDAPDAO()
	{
		logger.error("ldap getLDAPDAO;");
		return UserDAOImpl.getInstance();
	}

}