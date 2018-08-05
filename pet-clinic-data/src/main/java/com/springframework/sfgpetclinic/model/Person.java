package com.springframework.sfgpetclinic.model;

public class Person {
	
	private String firstName;
	private String lastName;
	private String sex;
	
	public String getFirstName() {
		return firstName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
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
	
	
}
