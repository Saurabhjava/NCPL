package com;

import java.util.Scanner;

public class DataBaseDemo {
	public static void main(String[] args) {
		CustomerDao cdao=new CustomerDao();
		//cdao.readAllCustomer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer ID");
		int cid=sc.nextInt();
		System.out.println("Enter Customer Name");
		String name=sc.next();
		System.out.println("Enter Customer Email");
		String email=sc.next();
		
		cdao.createCustomer(cid, name,email);
		
		System.out.println("================================================");		
		cdao.readAllCustomer();
	}
}
