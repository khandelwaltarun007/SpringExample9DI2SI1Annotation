package com.spring.example9.di2si1.annotation;

public class Employee {
	private int empno;
	private String empname;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empno, String empname) {
		super();
		this.empno = empno;
		this.empname = empname;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public void printInfo() {
		System.out.println("Employee ID: " + empno + "\t Employee Name: " + empname);
	}
}
