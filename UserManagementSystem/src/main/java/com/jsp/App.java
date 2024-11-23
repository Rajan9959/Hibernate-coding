package com.jsp;

import java.util.Scanner;

import com.jsp.DAO.UserDAO;
import com.jsp.DAO.UserHelper;
import com.jsp.entity.Userdetail;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserDAO dao = UserHelper.userHelper();

		System.out.println(
				"Enter \n 1. For user Registration \n 2. To get User Details bu Id \n 3. To Update Password By Using Id "
				+ "\n 4. To Delete The Account \n 5. To Update all the details \n 6. Update password by emailid "
				+ "\n 7. get user by user id \n 8. Get All User details \n 9. Get First Name by Using emailid");
		int num = sc.nextInt();
		switch (num) {
		case 1: {
			Userdetail userdetail = new Userdetail();

			System.out.println("Enter Your First_Name");
			userdetail.setFirst_Name(sc.next());
			System.out.println("Enter Your Last_Name");
			userdetail.setLast_Name(sc.next());
			System.out.println("Enter Your Mobile_Number");
			userdetail.setMobile_Number(sc.next());
			System.out.println("Enter Your Gender");
			userdetail.setGender(sc.next());
			System.out.println("Enter Your Emailid");
			userdetail.setEmail_Id(sc.next());
			System.out.println("Enter Your Password");
			userdetail.setPassword(sc.next());
			System.out.println("Enter Your Age");
			userdetail.setAge(sc.nextInt());
			dao.userRegistration(userdetail);
			break;
		}
		case 2: {
			System.out.println("Enter your Id");

			dao.getUserDetailsByUsingId(sc.nextInt());
			break;

		}
		case 3: {
			System.out.println("Enter the id which password to change");
			int id = sc.nextInt();
			System.out.println("Enter the password");
			String password = sc.next();
			dao.updateUserPassword(id, password);
			break;
		}
		case 4: {
			System.out.println("Enter User Id : ");
			int uid = sc.nextInt();
			dao.removeUserDetails(uid);

			break;

		}
		case 5: {
			System.out.println(
					"Enter /n 1.To Update First name /n 2.To Update Email Id /n 3.To Update Password /n 4.To Update Mobile Number ");

			int num1 = sc.nextInt();
			int[] arr = new int[num1];
			System.out.println("Enter Number of Details you are going to Update");
			int num2 = sc.nextInt();
			System.out.println(num2);
			switch (num1) {
			case 1: {
				System.out.println("Enter your New FirstName");

				break;
			}
			case 2: {
				break;
			}
			case 3: {
				break;
			}
			case 4: {
				break;
			}
			default: {

			}
			}

			break;
		}

		case 6: {
			System.out.println("Enter password to change");
			String password = sc.next();
			System.out.println("Enter the Emaili id");
			String mailid = sc.next();
			dao.UpdateUserPasswordByEmailId(password, mailid);
			break;
		}

		case 7:
			System.out.println("Enter user id");
			dao.getUserDetailsByUsingUserId(sc.nextInt());
			break;

		case 8:
			dao.getAllUserDetails();
			break;
			
		case 9:
			System.out.println("Enter your Email id");
			dao.getFirstNameByEmailId(sc.next());
			break;

		default: {
			System.out.println("Please enter valid Input");
			break;
		}

		}
	}
}