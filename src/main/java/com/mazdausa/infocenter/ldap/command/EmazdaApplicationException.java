package com.mazdausa.infocenter.ldap.command;

import org.apache.log4j.Logger;

public class EmazdaApplicationException extends Exception
{
	//final static Logger logger = Logger.getLogger(EmazdaApplicationException.class);

	private static final Logger logger = Logger.getLogger(EmazdaApplicationException.class);
	 
	/** the nested exception */
	private Throwable m_cause = null;

	/**
	 * 
	 */
	public EmazdaApplicationException()
	{
		super();

	}
	/**
	 * @param message
	 */
	public EmazdaApplicationException(String message)
	{
		super(message);
	}

	/**
	 * Constructor for MazdaBaseException
	 */
	public EmazdaApplicationException(String arg0, Throwable cause) {
		super(arg0);
		try {
			initCause(cause);
		} catch (Exception e) {
		}
	}

	/**
	 * Constructor for MazdaBaseException
	 */
	public EmazdaApplicationException(Throwable cause) {
		super();
		try {
			initCause(cause);
		} catch (Exception e) {
		}

	}

	/**
	 * Returns the cuase of this throwable.
	 * 
	 * @return the cause of this throwable or null 
	 */
	public Throwable getCause() {
		return (m_cause);
	}

	/**
	 * @param the cause (which is saved for later retrieval by the getCause() method.
	 * @return a reference to this Throwable instance
	 */
	public Throwable initCause(Throwable cause)
			throws IllegalStateException, IllegalArgumentException {
		if (cause == null) {
			return (this);
		}
		if (m_cause != null) {
			throw (new IllegalArgumentException("Cause can only be set once"));
		}
		if (cause.equals(this)) {
			throw (new IllegalArgumentException("Exception cannot be its own cause"));
		}
		m_cause = cause;
		return (this);
	}

	/**
	 * Printstacktrace to track the exception.
	 */

	public void printStackTrace() {
		Throwable e = getCause();
		super.printStackTrace();
		if (e != null && !e.equals(this)) {
			logger.error("\nCaused by:");
			e.printStackTrace();
		}
	}
}
