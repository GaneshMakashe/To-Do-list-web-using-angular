package com.targettheaim.rest.basic.auth;

public class AuthenticationBean {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("HelloWorldBean [message=%s]", message);
	}

	public AuthenticationBean(String message) {
		this.message = message;
	}
}
