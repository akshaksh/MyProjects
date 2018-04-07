package com.bharaththippireddy.trainings.jaxrsclient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.bharaththippireddy.trainings.jaxrs.Patient;

public class PatientServiceClient {

	final static String PATIENT_SERVICE_URL="http://localhost:8089/RESTWS/services/patientservice";
	public static void main(String[] args) {
		Client client=ClientBuilder.newClient();
		/* First example for GET Method*/
		
		/*WebTarget getTarget = client.target(PATIENT_SERVICE_URL).path("/patients").path("/{id}").resolveTemplate("id",123);
		Response response = getTarget.request().get();  //used to know only status
		Patient patient=getTarget.request().get(Patient.class);
		System.out.println(response.getStatus());
		System.out.println("id:"+patient.getId());
		System.out.println("name:"+patient.getName());*/
		
		/* First example for PUT(Update) Method*/
		
		/*WebTarget putTarget = client.target(PATIENT_SERVICE_URL).path("/patients");
		patient.setName("Ajay Kushwaha");
		Response updateResponse=putTarget.request().put(Entity.entity(patient, MediaType.APPLICATION_XML));
		System.out.println(updateResponse.getStatus());*/
		
		/* New Record Creation with POST method*/
		
		/*WebTarget postTarget = client.target(PATIENT_SERVICE_URL).path("/patients");
		Patient newPatient= new Patient();
		newPatient.setName("Rakesh Kumar pagal");
		//Response postResponse=postTarget.request().post(Entity.entity(newPatient, MediaType.APPLICATION_XML)); used to get status only
		Patient postResponse=postTarget.request().post(Entity.entity(newPatient, MediaType.APPLICATION_XML),Patient.class);
		System.out.println(postResponse.getId()+": After Creation of New Record");
		System.out.println("id:"+postResponse.getId());
		System.out.println("name:"+postResponse.getName());*/
		
		/* Deletion of Record with DELETE Method*/
		
		WebTarget deleteTarget = client.target(PATIENT_SERVICE_URL).path("/patients").path("/{id}").resolveTemplate("id",126);
		Response deleteResponse = deleteTarget.request().delete();  //used to know only status
		System.out.println("Record deletion : "+deleteResponse.getStatus());
		deleteResponse.close();
		client.close();
		
	}

}

