package com.jsp.DAO;

import java.util.List; 

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entity.Userdetail;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class UserDAOImpl implements UserDAO {

	@Override
	public void userRegistration(Userdetail userdetail) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("UserManagementSystem");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		System.out.println("Object Inserted....");
		manager.persist(userdetail);
		transaction.commit();
		manager.close();
		factory.close();

	}

	@Override
	public void getUserDetailsByUsingId(int userid) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("UserManagementSystem");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();

		Userdetail userdetail = manager.find(Userdetail.class, userid);
		if (userdetail != null) {
			System.out.println("FirstName: " + userdetail.getFirst_Name());
			System.out.println("LastName: " + userdetail.getLast_Name());
		} else {
			System.out.println("No details found");
		}

		manager.close();

		factory.close();

	}

	@Override
	public void updateUserPassword(int userid, String password) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("UserManagementSystem");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Userdetail userdetail = manager.find(Userdetail.class, userid);
		if (userdetail != null) {
			System.out.println(userdetail);
			userdetail.setPassword(password);
			System.out.println(userdetail);

		} else {
			System.out.println("No Details Found");
		}
		transaction.commit();
		manager.close();
		factory.close();
	}

	@Override
	public void updateUserDetails(Userdetail userdetail) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("UserManagementSystem");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Userdetail userdetail1 = manager.find(Userdetail.class, userdetail);
		if (userdetail1 != null) {
			System.out.println(userdetail1);
			userdetail1.setFirst_Name(userdetail.getFirst_Name());
			userdetail1.setPassword(userdetail.getPassword());
			userdetail1.setEmail_Id(userdetail.getEmail_Id());
			userdetail1.setMobile_Number(userdetail.getMobile_Number());
			System.out.println(userdetail1);

		} else {
			System.out.println("No Details Found");
		}
		transaction.commit();
		manager.close();
		factory.close();
	}

	@Override
	public void removeUserDetails(int user_Id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("UserManagementSystem");

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();

		Userdetail userdetail = manager.find(Userdetail.class, user_Id);
		if (userdetail != null) {
			System.out.println(manager.contains(userdetail));

			manager.remove(userdetail);

			System.out.println(manager.contains(userdetail));

			System.out.println("Record Deleted");
		} else {
			System.out.println("No Data Found");
		}

		transaction.commit();

	}

	@Override
	public void UpdateUserPasswordByEmailId(String password, String email_Id) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("UserManagementSystem");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();

		String update = "Update Userdetail user set user.password =?1 where user.email_Id =?2";

		Query query = manager.createQuery(update);

		query.setParameter(1, password);
		query.setParameter(2, email_Id);

		int result = query.executeUpdate();
		System.out.println(result);

		if (result != 0) {
			System.out.println("Password updated successfully..emailid.!!!!");

		} else {

			System.out.println("Invalid emailid ");

		}

		transaction.commit();
		manager.close();
		factory.close();

	}

	@Override
	public void getUserDetailsByUsingUserId(int userid) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("UserManagementSystem");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

		String select = "select user from Userdetail user where user.user_Id=:uid";

		Query query = manager.createQuery(select);

		query.setParameter("uid", userid);
		try {
			Userdetail user = (Userdetail) query.getSingleResult();
			System.out.println(user);
		} catch (Exception e) {
			System.out.println("No user found");
		}

	}

	@Override
	public void getAllUserDetails() {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("UserManagementSystem");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

		String select = "select user from Userdetail user";

		Query query = manager.createQuery(select);

		List<Userdetail> resultList = query.getResultList();

		for (Userdetail userdetail : resultList) {
			System.out.println("First Name : " + userdetail.getFirst_Name());
			System.out.println("Last Name : " + userdetail.getLast_Name());
			System.out.println("Email id : " + userdetail.getEmail_Id());
			System.out.println("Mobile Number : " + userdetail.getMobile_Number());
		}

	}

	@Override
	public void getFirstNameByEmailId(String emailid) 
	{
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("UserManagementSystem");
		
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		
		String select = "select user.first_Name,user.last_Name from Userdetail user where user.email_Id=:email";
		
		TypedQuery<Object[]> typedQuery = manager.createQuery(select, Object[].class);
		
		typedQuery.setParameter("email", emailid);
		
		List<Object[]> resultList = typedQuery.getResultList();
		
		for (Object[] objects : resultList) {
			
			String firstname = (String) objects[0];
			String lastname = (String) objects[1];
			
			System.out.println(firstname);
			System.out.println(lastname);
		}
		
		manager.close();
		factory.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}

}