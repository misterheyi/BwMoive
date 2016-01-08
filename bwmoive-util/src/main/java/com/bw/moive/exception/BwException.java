package com.bw.moive.exception;

/**
 * 自定义异常
 * 
 * @author heyi
 *
 */
public class BwException extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3836538838841464575L;

	public BwException() {
		super();
	}

	public BwException(String message) {
		super(message);
	}

	public BwException(String message, Throwable cause) {
		super(message, cause);
	}

	public BwException(Throwable cause) {
		super(cause);
	}

	protected BwException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
