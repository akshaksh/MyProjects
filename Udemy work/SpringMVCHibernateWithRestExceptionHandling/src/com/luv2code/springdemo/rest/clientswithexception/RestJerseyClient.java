package com.luv2code.springdemo.rest.clientswithexception;

/*
RestTemplate works fine but in case of exception return it is not able to handle
so we use Jersey Client for handle the exception thrown
*/

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.exceptionhandling.ErrorDetail;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class RestJerseyClient {

	public static void main(String[] args) {
		final String url="http://localhost:8082/SpringMVCHibernateWithRestExceptionHandling/webservices";
		Client client = Client.create();
		WebResource webResource = client.resource(url+"/customer/102");
		ClientResponse response = webResource.accept("application/xml").get(ClientResponse.class);
		if(response.getStatus() == 404){
			ErrorDetail error=response.getEntity(ErrorDetail.class);
			System.out.println(error.getMessage());
			System.out.println(error.getStatus());
			System.out.println(error.getUrl());
		}
		else{
			Customer customer=response.getEntity(Customer.class);
			System.out.println(customer.getFirstName());
			System.out.println(customer.getLastName());
			System.out.println(customer.getId());
			System.out.println(customer.getEmail());
		}

	}

}
