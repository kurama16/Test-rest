package com.example.ejercicio.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.ejercicio.exceptions.base.ApplicationException;
import com.example.ejercicio.exceptions.base.RepositoryException;

@ControllerAdvice
public class ProjectExceptionHandler extends ResponseEntityExceptionHandler {
	private static final Logger log = LoggerFactory.getLogger(ProjectExceptionHandler.class);

	@ExceptionHandler(value = { ApplicationException.class })
	public ResponseEntity<ExceptionResponse> handleApplicationError(Exception e) {
		log.error("IN APPLICATION  LOGIC", e);
		ExceptionResponse error = new ExceptionResponse(e.getMessage());
		return new ResponseEntity<>(error, new HttpHeaders(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = { RepositoryException.class })
	public ResponseEntity<ExceptionResponse> handleRepositoryError(Exception e) {
		log.error("IN REPOSITORY  LOGIC", e);
		ExceptionResponse error = new ExceptionResponse(e.getMessage());
		return new ResponseEntity<>(error, new HttpHeaders(), HttpStatus.BAD_REQUEST);
	}

}
