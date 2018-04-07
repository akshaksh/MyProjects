/**
 * 
 */
package com.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.employee.Employee;

/**
 * @author Ajay_Kushwaha
 *
 */
@WebService
@SOAPBinding(parameterStyle=ParameterStyle.WRAPPED,style=Style.RPC,use=Use.LITERAL)
public interface EmployeeService {

	@WebMethod
	@WebResult(name="AddedEmployeeStatus")
	public int addEmployee(@WebParam(name="Employee")Employee e);
	@WebMethod
	@WebResult(name="DeletedEmployeeStatus")
	public boolean deleteEmployee(@WebParam(name="employeeid")int id);
	@WebMethod
	@WebResult(name="EmployeeInformation")
	public Employee getPersonDetail(@WebParam(name="employeeid")int id);
	@WebMethod
	@WebResult(name="LOE")
	public Employee[] getAllPerson();
	
}
