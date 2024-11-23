package com.jsp.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.jsp.entity.Product;

public class ProductDaoImpl implements ProductsDao
{

	@Override
	public void addProduct(Product product) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("eShoppingByHibernate");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		System.out.println("Product Inserted");
		manager.persist(product);
		transaction.commit();
		manager.close();
		factory.close();
		
	}

	@Override
	public void getProductPropertiesByProductId(int id) 
	{
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("eShoppingByHibernate");
		
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		
		String select = 
				"select product.product_Name,product.product_Brand,product.product_Category from Product product where product.product_Id=:id";
		
		TypedQuery<Object[]> typedQuery = manager.createQuery(select, Object[].class);
		
		typedQuery.setParameter("id", id);
		
		List<Object[]> resultList = typedQuery.getResultList();
		
		for (Object[] objects : resultList) {
			String pname = (String) objects[0];
			String pbrand = (String) objects[1];
			String pcategory = (String) objects[2];
			
			System.out.println(pname);
			System.out.println(pbrand);
			System.out.println(pcategory);
		}
		
		manager.close();
		factory.close();
		
		
		
		
	}

}
