package com.jsp.entity;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the userdetails database table.
 * 
 */
@Entity
@Table(name="userdetails")
@NamedQuery(name="Userdetail.findAll", query="SELECT u FROM Userdetail u")
public class Userdetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int user_Id;

	private int age;

	@Column(length=255)
	private String email_Id;

	@Column(length=255)
	private String first_Name;

	@Column(length=255)
	private String gender;

	@Column(length=255)
	private String last_Name;

	@Column(length=255)
	private String mobile_Number;

	@Column(length=255)
	private String password;

	public Userdetail() {
	}

	public int getUser_Id() {
		return this.user_Id;
	}

	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail_Id() {
		return this.email_Id;
	}

	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}

	public String getFirst_Name() {
		return this.first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLast_Name() {
		return this.last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public String getMobile_Number() {
		return this.mobile_Number;
	}

	public void setMobile_Number(String mobile_Number) {
		this.mobile_Number = mobile_Number;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Userdetail [user_Id=" + user_Id + ", age=" + age + ", email_Id=" + email_Id + ", first_Name="
				+ first_Name + ", gender=" + gender + ", last_Name=" + last_Name + ", mobile_Number=" + mobile_Number
				+ ", password=" + password + "]";
	}
	
	

}