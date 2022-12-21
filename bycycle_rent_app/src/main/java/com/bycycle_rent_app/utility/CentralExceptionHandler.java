package com.bycycle_rent_app.utility;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.bycycle_rent_app.exception.BicycleRentException;

@RestControllerAdvice
public class CentralExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorInfo> generalExceptionHandler(Exception exception){
		ErrorInfo errorInfo = new  ErrorInfo();
		errorInfo.setMessage(exception.getMessage());
		errorInfo.setErrorcode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		errorInfo.setTimestamp(LocalDateTime.now());
		return new ResponseEntity<>(errorInfo,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	@ExceptionHandler(BicycleRentException.class)
	public ResponseEntity<ErrorInfo> bicycleRentExceptionHandler(BicycleRentException rentException){
		ErrorInfo errorInfo = new  ErrorInfo();
		errorInfo.setMessage(rentException.getMessage());
		errorInfo.setErrorcode(HttpStatus.BAD_REQUEST.value());
		errorInfo.setTimestamp(LocalDateTime.now());
		return new ResponseEntity<>(errorInfo,HttpStatus.BAD_REQUEST);
		
	}
}
