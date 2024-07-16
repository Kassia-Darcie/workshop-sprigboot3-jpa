package com.kassiadarcie.webservices_com_springboot.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	public ResourceNotFoundException(Long id) {
		super("Resource not found. Id " + id);
	}
}
