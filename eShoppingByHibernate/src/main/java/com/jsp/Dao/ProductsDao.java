package com.jsp.Dao;

import com.jsp.entity.Product;

public interface ProductsDao 
{
	void addProduct(Product product);
	
	void getProductPropertiesByProductId(int id);
}
