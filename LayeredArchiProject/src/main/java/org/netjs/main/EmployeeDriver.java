package org.netjs.main;
import java.util.List;

import org.netjs.Account.dao.EmployeeDao;
import org.netjs.Account.dao.EmployeeDaoImpl;
import org.netjs.Account.dto.Employee;
import org.netjs.Account.service.EmployeeService;
import org.netjs.Account.service.EmployeeService1Impl;


public class EmployeeDriver {
	public static void main(String[] args) {
		EmployeeDao empDao=new EmployeeDaoImpl();
		EmployeeService empService=new EmployeeService1Impl(empDao);
		List<Employee> emplist=empService.getEmployee();
		for(Employee emp:emplist) {
			System.out.println(emp);
		}
		
	}

}
