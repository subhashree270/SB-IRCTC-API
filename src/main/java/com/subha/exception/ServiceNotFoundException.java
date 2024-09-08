package com.subha.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ServiceNotFoundException extends RuntimeException{
	
	public ServiceNotFoundException(String msg) {
		super(msg);
	}
	
	
	
	

}
