package com.stock.web.exception;

public class ApplicationException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int errorCode;
	String errorMessage;

	public ApplicationException(int errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public String getMessage() {
		return (errorCode + ":" + errorMessage);
	}

}