package org.netjs.Account.service;

import java.util.List;

import org.netjs.Account.dto.Employee;

public interface EmployeeService {

	
		public Employee getEmployeeById(int empId);
		public List<Employee>getEmployee();
		public List<Employee>getEmployeesByDept();
		public void deleteEmployee(int empId);

	

}