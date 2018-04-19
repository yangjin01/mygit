package com.tyjy.app.exceptionhanding;

public class EmployeeExNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public EmployeeExNotFoundException(int id){
	    super("EmployeeNotFoundException with id="+id);
	  }

}
