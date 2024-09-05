package com.Microservices.AOP;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

class MyError{
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}


@ControllerAdvice
public class MovieExceptionHandle {

	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public ResponseEntity handleRuntimeException(RuntimeException e) {		//public String handleRuntimeException(RuntimeException e)
		System.out.println("Error Occured");
//		MyError error=new MyError();
//		error.setMessage(e.getMessage());
//		return error.getMessage();
		
		return ResponseEntity.status(500).body(e.getMessage());
	}
}
