package com.tyjy.app.exceptionhanding;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_ACCEPTABLE, reason="Employee Not Found") //404
public class NotAcceptedException extends Exception {

	/**
	 *
	 * 通过使用@ResponseStatus注解异常
	 */
	
	private static final long serialVersionUID = 3203391694802775201L;

	public NotAcceptedException(int id) {
		// TODO 自动生成的构造函数存根
		super("EmployeeNotFoundException with id="+id);
	}

}
