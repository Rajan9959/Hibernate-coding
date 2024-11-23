package com.jsp.DAO;

public class UserHelper 
{
	public static UserDAO userHelper() 
	{
		UserDAO dao = new UserDAOImpl();
		
		return dao;
	}
	
}
