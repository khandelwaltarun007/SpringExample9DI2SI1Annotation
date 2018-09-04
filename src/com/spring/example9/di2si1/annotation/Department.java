package com.spring.example9.di2si1.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Department {
	private int deptno;
	private String deptname;
	private List<Employee> employees;

	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(int deptno, String deptname, List<Employee> employees) {
		super();
		this.deptno = deptno;
		this.deptname = deptname;
		this.employees = employees;
	}

	public int getDeptno() {
		return deptno;
	}

	
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	@Autowired
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public void printInfo() {
		System.out.println("Department no: " + deptno);
		System.out.println("Department name:" + deptname);
		for(Employee employee : employees) {
			System.out.println("employee no in department : "+employee.getEmpno());
			System.out.println("employee names in department : "+employee.getEmpname());
		}
	}
}
