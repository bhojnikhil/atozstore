/**
 * 
 */
package com.surveyproject.atozstore;

/**
 * @author Nikhil
 *
 */
public class AToZStoreException extends RuntimeException
{
	private static final long serialVersionUID = 1L;

	public AToZStoreException()
	{
		super();
	}

	public AToZStoreException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
	{
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public AToZStoreException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public AToZStoreException(String message)
	{
		super(message);
	}

	public AToZStoreException(Throwable cause)
	{
		super(cause);
	}
	
}
