package com.bharaththippireddy.trainings.jaxrs.client;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.client.AsyncInvoker;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import com.bharaththippireddy.trainings.jaxrs.Check;
import com.bharaththippireddy.trainings.jaxrs.ChecksList;

public class CheckProcessorClient {

	public static void main(String[] args) {

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8089/RESTWSAsync/services/checkservice/checks");

		AsyncInvoker asyncInvoker = target.request().async();
		ChecksList checksList = new ChecksList();
		ArrayList<Check> checks = new ArrayList<Check>();
		checks.add(new Check());
		checksList.setChecks(checks);
		Future<Boolean> future = asyncInvoker.post(Entity.entity(checksList, MediaType.APPLICATION_ATOM_XML),
				new ChecksResponseCallbackHandler());
		try {
			System.out.println("check:"+future.get());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
