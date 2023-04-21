/**
 * 
 */
package com.teachersystem.exceptions;

/**
 * @author vijay
 *
 */
public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException(String s) {
		super(s);
	}
	
	public ResourceNotFoundException() {
		super("Resource not Found");
	}
}
