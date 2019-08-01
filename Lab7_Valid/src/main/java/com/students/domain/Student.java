package com.students.domain;

import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.*;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;


public class Student {
	
	private Integer id;
	@NotBlank
	@Size(min = 4, max = 30, message = "{Size.firstName.validate}")
 	private String firstName = null;
	@NotEmpty(message = "Enter last name")
 	private  String lastName  = null;
	@Email
 	private String email = null;
	@NotEmpty
 	private String gender = null;
	@NotNull
	@DateTimeFormat(pattern = "mm-dd-yyyy")
	@Past
    private Date birthday;
 	@NotNull
	@NumberFormat(pattern = "aaa-ppp-nnnn")
	private Phone phone;

  	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}	
	   	
	   

}
