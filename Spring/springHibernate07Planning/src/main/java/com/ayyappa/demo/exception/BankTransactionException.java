package com.ayyappa.demo.exception;

public class BankTransactionException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public BankTransactionException(String msg) {
		super(msg);
	}

}
