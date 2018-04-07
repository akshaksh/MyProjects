package com.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceRef;

import com.employee.Employee;
import com.webservice.EmployeeService;

public class SimpleJaxwsClient {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:8088/WebServices/employee?wsdl");

        //1st argument service URI, refer to wsdl document above
		//2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://webservice.com/", "EmployeeServiceImplService");
        Service service = Service.create(url, qname);
        EmployeeService emp = service.getPort(EmployeeService.class);
        Employee empdesc=emp.getPersonDetail(1);
        System.out.println(empdesc.getId());
        System.out.println(empdesc.getName());
        System.out.println(empdesc.getAge());
        System.out.println(empdesc.getGender());
        System.out.println(empdesc.getSalary());

		

	}

}
