package org.netjs.Account.dto;

public class Employee {
	private int empNo;
	private String empName;
	private double salary;
	private String deptName;
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
    public String toString(){
		return "empno:  "+getEmpNo()+"  emp name :   "+getEmpName()+"  emp salary : "+getSalary()+"  dep name:  "+ getDeptName();
    	
    }
}
