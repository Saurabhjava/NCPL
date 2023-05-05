package com;

class Outer {
	public void m1() {
		class Inner {
			public void display() {
				System.out.println("Display Method");
			}
		}
		
		System.out.println("M1 Method");
		Inner obj1=new Inner();
		obj1.display();
	}
	
}
public class InnerClassDemo {

	public static void main(String[] args) {
		Outer obj=new Outer();
		obj.m1();
	
	}

}
