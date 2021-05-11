package org.netjs.Account.service;
import java.util.ArrayList;
import java.util.List;
import org.netjs.Account.dao.EmployeeDao;
import org.netjs.Account.dto.Employee;

public class EmployeeService1Impl implements EmployeeService{
	EmployeeDao  employeedao;
	public EmployeeService1Impl(EmployeeDao  employeedao){
		this.employeedao=employeedao;
	}
	@Override
	public Employee getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployee() {
		List<Employee> emp = new ArrayList<Employee>();
		emp  = employeedao.getEmployees();
		return emp;
	}

	@Override
	public List<Employee> getEmployeesByDept() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		
	}

}
