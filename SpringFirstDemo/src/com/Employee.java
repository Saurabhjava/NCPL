package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int empid=101;
	private String name="Moulika";
	private String email="moulika@gmail.com";
	@Autowired
	private Address address;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void printEmployeeDetails() {
		System.out.println("Employee ID:"+empid);
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Email:"+email);
		System.out.println("===========Address Of Employee===========");
		System.out.println("City: "+address.getCity());
		System.out.println("Country: "+address.getCountry());
		System.out.println("Zip: "+address.getZip());
	}
}
