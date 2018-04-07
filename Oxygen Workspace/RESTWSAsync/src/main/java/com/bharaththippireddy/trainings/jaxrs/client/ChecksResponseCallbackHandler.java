package com.bharaththippireddy.trainings.jaxrs.client;

import javax.ws.rs.client.InvocationCallback;

public class ChecksResponseCallbackHandler implements InvocationCallback<Boolean> {

	
	public void completed(Boolean response) {
		System.out.println("Success" + response);

	}

	public void failed(Throwable e) {
		e.printStackTrace();
	}

}
