package com.webservice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.employee.Employee;
@WebService(endpointInterface="com.webservice.EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {

	static Map<Integer,Employee> map=new HashMap<>();
	
	
	@Override
	public int addEmployee(Employee e) {
		map.put(e.getId(), e);
		return e.getId();
	}
	
	@Override
	public boolean deleteEmployee(int id) {
		if(map.containsKey(id))
		{
			map.remove(id);
			return true;
		}
		else {
		return false;
		}
	}
	
	@Override
	public Employee getPersonDetail(int id) {
		Employee emp=null;
		if(map.containsKey(id)) {
			emp=map.get(id);
		}
		return emp;		
	}

	@XmlElementWrapper(name="LISTOFEMPLOYEES")
	@XmlElement(name="EmployeeInfo")
	@Override
	public Employee[] getAllPerson() {
		Employee emp[]=new Employee[map.size()];int i=0;
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> it=keySet.iterator();
		while(it.hasNext()) {
				emp[i++]=(map.get(it.next()));
		}
		if(emp.length == 0)
			emp=null;
		System.out.println(emp);
		return emp;
	}

}
