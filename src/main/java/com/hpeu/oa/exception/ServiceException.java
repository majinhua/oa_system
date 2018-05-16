package com.hpeu.oa.exception;

/**
 * service异常
 * yfly <br>
 * ServiceException <br>
 * 2018-05-02 02:46:28<br>
 *
 */
public class ServiceException extends Exception {

	
	private static final long serialVersionUID = 1L;

	public ServiceException() {
		super();
	}
	
	public ServiceException(String message) {
		super(message);
	}
}
