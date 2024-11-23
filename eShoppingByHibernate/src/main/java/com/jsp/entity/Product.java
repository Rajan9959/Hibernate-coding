package com.jsp.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="products")
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int product_Id;

	@Column(length=50)
	private String product_Brand;

	@Column(length=50)
	private String product_Category;

	@Column(nullable=false, length=40)
	private String product_Name;

	@Column(nullable=false)
	private double product_Price;

	private int product_Quantity;

	@Column(length=5)
	private String product_Review;

	public Product() {
	}

	public int getProduct_Id() {
		return this.product_Id;
	}

	public void setProduct_Id(int product_Id) {
		this.product_Id = product_Id;
	}

	public String getProduct_Brand() {
		return this.product_Brand;
	}

	public void setProduct_Brand(String product_Brand) {
		this.product_Brand = product_Brand;
	}

	public String getProduct_Category() {
		return this.product_Category;
	}

	public void setProduct_Category(String product_Category) {
		this.product_Category = product_Category;
	}

	public String getProduct_Name() {
		return this.product_Name;
	}

	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}

	public double getProduct_Price() {
		return this.product_Price;
	}

	public void setProduct_Price(double product_Price) {
		this.product_Price = product_Price;
	}

	public int getProduct_Quantity() {
		return this.product_Quantity;
	}

	public void setProduct_Quantity(int product_Quantity) {
		this.product_Quantity = product_Quantity;
	}

	public String getProduct_Review() {
		return this.product_Review;
	}

	public void setProduct_Review(String product_Review) {
		this.product_Review = product_Review;
	}

}