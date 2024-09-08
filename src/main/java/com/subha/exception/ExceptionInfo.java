package com.subha.exception;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionInfo {
	
	private String code;
	private String msg;
	private LocalDateTime time;

}
