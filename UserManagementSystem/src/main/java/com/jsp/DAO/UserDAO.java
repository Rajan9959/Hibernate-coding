package com.jsp.DAO;

import com.jsp.entity.Userdetail;

public interface UserDAO 
{

		public void userRegistration(Userdetail userdetail);
		
		public void getUserDetailsByUsingId(int userid);
		
		void updateUserPassword(int userid,String password);
		
		void updateUserDetails(Userdetail userdetail);
		
		void removeUserDetails(int user_Id);
		
		void UpdateUserPasswordByEmailId(String password,String email_Id);
		
		void getUserDetailsByUsingUserId(int userid);
		
		void getAllUserDetails();
		
		void getFirstNameByEmailId(String emailid);
		
		
}
