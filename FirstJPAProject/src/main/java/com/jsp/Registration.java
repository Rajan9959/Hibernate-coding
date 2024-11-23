package com.jsp;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Registration
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		EmployeeDetails employeeDetails = new EmployeeDetails();
		
		System.out.println("Enter Employee Name");
		employeeDetails.setEmpname(scanner.nextLine());
		System.out.println("Enter Employee designation");
		employeeDetails.setEmpdesignation(scanner.nextLine());
		System.out.println("Enter Employee Salary");
		employeeDetails.setEmpsalary(scanner.nextDouble());
		System.out.println("Enter Employee Department Number");
		employeeDetails.setEmpdeptno(scanner.nextInt());
		
		System.out.println(employeeDetails);
		
		// For Establishing the Connection.  STEP - 1 
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("FirstJPAProject");
		
		// For creation of Platform.  STEP - 2
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		/* To specify that we are beginning the operation we make use of the method "begin()"  STEP - 3 */ 
		transaction.begin();
		
		// Operations
		manager.persist(employeeDetails);
		
		System.out.println("Data Inserted");
		
		/* After performing the write operation the data which is sending for insertion
		 * what ever the data sending for the Updation and
		 * whatever the data sending we are deleting within the database should be permanent 
		 * effected for that we make use of the method called as commit. STEP - 4
		 */
		
		boolean contains = manager.contains(employeeDetails);
		System.out.println(contains);
		
		transaction.commit();
		
	}

}
