package com.mazdausa.infocenter.ldap.command;

public class LDAPExceptionHandler 
{
	/**
	 * Created:Nov 3, 2005
	 * Author:Mike Vu
	 * Method description:
	 * 
	 * @param t
	 * @throws CommandException
	 */
	/**
	 * Created:Nov 3, 2005
	 * Author:Mike Vu
	 * Method description:
	 * 
	 * @param t
	 * @throws CommandException
	 */
	public static void handleException(Throwable t) throws CommandException
	{
		if(t instanceof UserNotExistException)
		{
			throw new CommandException(t.toString());
		}
		if (t instanceof LDAPException)
		{
			throw new CommandException(t.toString());
		}
	}
	/**
	 * Created:Nov 3, 2005
	 * Author:Mike Vu
	 * Method description:
	 * 
	 * @param param
	 * @throws IllegalArgumentException
	 */
	public static void handleNullParam(Object param) throws IllegalArgumentException
	{
		if(param == null)
			throw new IllegalArgumentException();
	}
}
