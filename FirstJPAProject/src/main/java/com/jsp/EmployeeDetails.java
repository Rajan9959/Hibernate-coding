package com.jsp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee",schema = "sample")
public class EmployeeDetails
{
	@Id
	@Column(name = "Emp_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empid;
	@Column(name = "Emp_Name",nullable = false,length = 50)
	private String empname;
	@Column(name = "Designation" , nullable = false,unique = true,length = 30)
	private String empdesignation;
	@Column(name = "Emp_Salary",nullable = false)
	private double empsalary;
	@Column(name = "Emp_Dept_No",nullable = false,length = 2)
	private int empdeptno;
	
	public EmployeeDetails() 
	{
		
	}

	public EmployeeDetails(int empid, String empname, String empdesignation, double empsalary, int empdeptno) 
	{
		this.empid = empid;
		this.empname = empname;
		this.empdesignation = empdesignation;
		this.empsalary = empsalary;
		this.empdeptno = empdeptno;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpdesignation() {
		return empdesignation;
	}

	public void setEmpdesignation(String empdesignation) {
		this.empdesignation = empdesignation;
	}

	public double getEmpsalary() {
		return empsalary;
	}

	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}

	public int getEmpdeptno() {
		return empdeptno;
	}

	public void setEmpdeptno(int empdeptno) {
		this.empdeptno = empdeptno;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [empid=" + empid + ", empname=" + empname + ", empdesignation=" + empdesignation
				+ ", empsalary=" + empsalary + ", empdeptno=" + empdeptno + "]";
	}
	
	
	
	
}
