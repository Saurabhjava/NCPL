package com;
class Employee {
	static String name="Moulika";
}
public class TestEmployee {

	public static void main(String[] args) {
		Employee obj=new Employee();
		Employee obj1=new Employee();
		
		System.out.println(obj.name);
		System.out.println(obj1.name);
		
		obj.name="Shaad";
		
		System.out.println(obj.name);
		System.out.println(obj1.name);
	}

}
