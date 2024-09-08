package com.subha.handler;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.subha.exception.ExceptionInfo;
import com.subha.exception.ServiceNotFoundException;

@RestControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value=ServiceNotFoundException.class)
	public ResponseEntity<ExceptionInfo> handleException(ServiceNotFoundException e){
		ExceptionInfo info=new ExceptionInfo("Ex001",e.getMessage(),LocalDateTime.now());
		return new ResponseEntity<>(info,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

}
