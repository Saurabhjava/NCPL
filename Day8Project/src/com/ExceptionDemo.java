package com;

import java.util.Scanner;

public class ExceptionDemo {
	int no1; 
	int no2;
	public ExceptionDemo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Nos");
		no1=sc.nextInt();
		no2=sc.nextInt();
	}
	public void div() {	
		if(no2!=0)
			System.out.println("Div Result="+(no1/no2));
		else
			System.out.println("No2 is 0, so div can not be performed");
	}
	public void add() {		
		System.out.println("Add Result="+(no1+no2));
	}
	public void sub() {		
		System.out.println("Sub Result="+(no1-no2));
	}

	public static void main(String[] args) {
		
		String names[]= {"Amit","Martin","Raj"};
		int elementCount=5;
		if(elementCount<names.length)
			System.out.println(names[elementCount]);
		else
			System.out.println("You are trying to access over the length");
		
		ExceptionDemo obj=new ExceptionDemo();
		obj.div();
		obj.add();
		obj.sub();
	}

}
