package com.service;

/**Project: springMongoDB
 * File: ObjectNotFoundException.java
 * @author jaime
 * Em 05-08-2020 **/

public class ObjectNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	/*
	 * Construct
	 */
	public ObjectNotFoundException(String message) {
		super(message);
	}
}
