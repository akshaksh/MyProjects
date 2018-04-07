package com.luv2code.springdemo.exceptionhandling;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="error")
public class ErrorDetail {

	private int status;
	private String message;
	private String url;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
