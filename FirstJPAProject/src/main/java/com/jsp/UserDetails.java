package com.jsp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class UserDetails 
{
	@Id
	@Column(name = "User_Id")
	private int userid;
	@Column(name = "First_Name")
	private String firstname;
	@Column(name = "Last_Name")
	private String lastname;
	@Column(name = "Email_Id")
	private String emailid;
	@Column(name = "Password")
	private String password;
	@Column(name = "Mobile_Number")
	private String mobilenumber;
	@Column(name = "Gender")
	private String gender;
	@Column(name = "Age")
	private int age;
	
	public UserDetails() 
	{
		
	}

	public UserDetails(int userid, String firstname, String lastname, String emailid, String password,
			String mobilenumber, String gender, int age) 
	{
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailid = emailid;
		this.password = password;
		this.mobilenumber = mobilenumber;
		this.gender = gender;
		this.age = age;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserDetails [userid=" + userid + ", firstname=" + firstname + ", lastname=" + lastname + ", emailid="
				+ emailid + ", password=" + password + ", mobilenumber=" + mobilenumber + ", gender=" + gender
				+ ", age=" + age + "]";
	}
	
}
