package com.hpeu.oa.exception;

/**
 * 数据持久层异常
 * yfly <br>
 * DaoException <br>
 * 2018-05-02 02:44:23<br>
 *
 */
public class DaoException extends Exception{

	private static final long serialVersionUID = 1L;

	public DaoException() {
		super();
	}
	
	public DaoException(String message) {
		super(message);
	}
}
