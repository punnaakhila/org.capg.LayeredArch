package org.netjs.Account.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.netjs.Account.dao.EmployeeDao;
import org.netjs.Account.dto.Employee;

@RunWith(MockitoJUnitRunner.class)
class TestEmployeeService {
	
		static EmployeeService employeeService = null;
		static EmployeeDao mockEmployeeDao=null;
		public static Employee emp1;
		public static Employee emp2;
		

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		mockEmployeeDao=Mockito.mock(EmployeeDao.class);
		employeeService=new EmployeeService1Impl(mockEmployeeDao);
		emp1 =new Employee();
		emp1.setEmpName("donno");
		emp1.setDeptName("timepass");
		emp1.setEmpNo(2387);
		emp1.setSalary(10000.0);
		emp2=new Employee();
		emp2.setEmpName("smith");
		emp2.setDeptName("hr dept");
		emp2.setEmpNo(2347);
		emp2.setSalary(1000.0);
		Mockito.when(mockEmployeeDao.getEmployees()).thenReturn(Arrays.asList(emp1,emp2));
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
	List<Employee> emplist=employeeService.getEmployee();
	assertEquals(2,emplist.size());
		
	}

}
