package com.jsp;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserRegistration 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		UserDetails details = new UserDetails();
		
		System.out.println("Enter your First Name");
		String fname = scanner.next();
		boolean condition = true;
		while(condition)
		{
			for (int i = 0; i < fname.length(); i++) 
			{
				char ch = fname.charAt(i);
				if(Character.isAlphabetic(ch))
				{
					details.setFirstname(fname);
				}
				else
				{
					System.out.println("Re-enter your First Name");
					fname = scanner.next();
				}
				
			}
			condition=false;
		}
		
		
		System.out.println("Enter your Last Name");
		String lname = scanner.next();
		boolean con1 = true;
		while(con1)
		{
			for (int i = 0; i < lname.length(); i++) 
			{
				char ch = lname.charAt(i);
				if(Character.isAlphabetic(ch))
				{
					details.setLastname(lname);
				}
				else
				{
					System.out.println("Re-enter your Last Name");
					lname = scanner.next();
				}
				
			}
			con1 = false;
		}
		
		System.out.println("Enter your Email Id");
		details.setEmailid(scanner.next());
		
		System.out.println("Enter your Password");
		String password = scanner.next();
		if(passwordValidation(password))
		{
			details.setPassword(password);
		}
		else
		{
			System.out.println("Re-enter the password");
			password = scanner.next();
		}
		
		System.out.println("Enter your Mobile Number");
		details.setMobilenumber(scanner.next());
		System.out.println("Enter your Gender");
		details.setGender(scanner.next());
		System.out.println("Enter you Age");
		details.setAge(scanner.nextInt());
		
		System.out.println(details);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("FirstJPAProject");
		
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		
		manager.persist(details);
		System.out.println("Registration success");
		
		transaction.commit();
		
		
	}
	
	
	public static boolean passwordValidation(String password)
	{
		boolean condition = true;
		while(true)
		{
			if(password.length() == 4)
			{
				char ch0 = password.charAt(0);
				char ch1 = password.charAt(1);
				char ch2 = password.charAt(2);
				char ch3 = password.charAt(3);
				
				if(Character.isUpperCase(ch0))
				{
					if(Character.isLowerCase(ch1))
					{
						if(!Character.isLetterOrDigit(ch2))
						{
							if(Character.isDigit(ch3))
							{
								return true;
								
							}
							else
							{
								System.out.println("Fourth character should be Digit");break;
							}
						}
						else
						{
							System.out.println("Third character should be Special character");break;
						}
					}
					else
					{
						System.out.println("Second character should be lowercase");break;
					}
				}
				else
				{
					System.out.println("First Character should be Capital");break;
				}
			}
			else
			{
				System.out.println("Password length should be 4");
				break;
			}
		}
		return condition;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
