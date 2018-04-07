package com.luv2code.springdemo.rest.clientswithexception;

import java.net.URI;
import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.entity.list.CustomerList;

public class AddCustomerRestClientWithException {

	public static void main(String[] args) {
		final String url="http://localhost:8082/SpringMVCHibernateWithRestExceptionHandling/webservices";
		RestTemplate restTemplate=new RestTemplate();
		
		//Get One Object by converting in json format
		/*Customer customer = restTemplate.getForObject(url+"/customer/2", Customer.class);
		System.out.println(customer.toString());
		String jsonFormat = restTemplate.getForObject(url+"/customer/2", String.class);
		System.out.println(jsonFormat);
		ResponseEntity<String> responseEntityJsonFormat = restTemplate.getForEntity(url+"/customer/2", String.class);
		System.out.println(responseEntityJsonFormat.getBody());
		System.out.println(responseEntityJsonFormat.getStatusCode());
		System.out.println(responseEntityJsonFormat.getHeaders());*/
		
		//Get One Object by converting in XML format
		HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML));
	    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
	    ResponseEntity result = restTemplate.exchange(url+"/customer/102", HttpMethod.GET, entity,String.class);
	    
		
		//Get All Objects by converting in Json Format
		/*CustomerList customerList=restTemplate.getForObject(url+"/customers", CustomerList.class);
		System.out.println(customerList.getCustomerList());
		String stringResult=restTemplate.getForObject(url+"/customers", String.class);
		System.out.println(stringResult);
		ResponseEntity<CustomerList> forEntity = restTemplate.getForEntity(url+"/customers", CustomerList.class);
		System.out.println(forEntity.getBody().getCustomerList());
		ResponseEntity<String> forEntityString = restTemplate.getForEntity(url+"/customers", String.class);
		System.out.println(forEntityString.getBody());
		 */
		
		
		//Get All Objects by converting in XML Format
		/*HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML));
	    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
	    ResponseEntity<CustomerList> customer = restTemplate.exchange(url+"/customers", HttpMethod.GET, entity, CustomerList.class);
	    System.out.println(customer.getBody().getCustomerList());
	    ResponseEntity<String> result = restTemplate.exchange(url+"/customers", HttpMethod.GET, entity, String.class);
	    System.out.println(result.getBody());
	    System.out.println(result.getHeaders());
	    System.out.println(result.getStatusCode());*/
		
		//Creating a new Client using JSON/XML Format
		/*Customer cust=new Customer();
		cust.setEmail("sddsf@gmail.com");
		cust.setFirstName("Gurusfsdd");
		cust.setLastName("Kumarsgdd");
	    Ways for the POST Method
	    a)String result=restTemplate.postForObject(url+"/addCustomer",cust,String.class);
	    System.out.println(result);
		b)ResponseEntity<String> postForEntity = restTemplate.postForEntity(url+"/addCustomer", cust,String.class);
		System.out.println(postForEntity.getBody());
		System.out.println(postForEntity.getHeaders());
		System.out.println(postForEntity.getStatusCode());
		c)URI postForLocation = restTemplate.postForLocation(url+"/addCustomer", cust);
		System.out.println(postForLocation);*/
		
		//Update the record using JSON/XML format
		/*Customer cust=new Customer();
		cust.setId(8);
		cust.setEmail("sddsf@gmail.com");
		cust.setFirstName("Gurusfsdd");
		cust.setLastName("Kumarsgdd");
		restTemplate.put(url+"/updateCustomer/8", cust);*/
		
		//Delete the record using JSON/XML format
		/*restTemplate.delete(url+"/deleteCustomer/8");*/
		
		
		
		
		
	}

}
