package org.netjs.Account.dao;

import java.util.ArrayList;
import java.util.List;

import org.netjs.Account.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public Employee findEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployees() {
		List<Employee> empList=new ArrayList<Employee>();
		Employee employee=new Employee();
		employee.setEmpName("donno");
		employee.setDeptName("timepass");
		employee.setEmpNo(2387);
		employee.setSalary(10000.0);
		empList.add(employee);
		employee=new Employee();
		employee.setEmpName("smith");
		employee.setDeptName("hr dept");
		employee.setEmpNo(2347);
		employee.setSalary(1000.0);
		empList.add(employee);
		return empList;
	}

	@Override
	public List<Employee> findEmployeesByDept() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}

}
