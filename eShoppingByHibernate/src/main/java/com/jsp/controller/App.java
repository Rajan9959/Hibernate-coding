package com.jsp.controller;

import java.util.Scanner;

import com.jsp.Dao.ProductDaoImpl;
import com.jsp.Dao.ProductsDao;
import com.jsp.entity.Product;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        ProductsDao productsDao = new ProductDaoImpl();
        Product product = new Product();
        
        System.out.println("Enter product Name :");
        product.setProduct_Name(sc.next());
        System.out.println("Enter Product price");
        product.setProduct_Price(sc.nextDouble());
        System.out.println("Enter product quantity");
        product.setProduct_Quantity(sc.nextInt());
        System.out.println("Enter product Brand");
        product.setProduct_Brand(sc.next());
        System.out.println("Enter product review");
        product.setProduct_Review(sc.next());
        System.out.println("Enter product category");
        product.setProduct_Category(sc.next());
   
        productsDao.addProduct(product);
        
        
        System.out.println("Enter your Product Id");
        productsDao.getProductPropertiesByProductId(sc.nextInt());
    }
}
