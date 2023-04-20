package com;

import java.util.Scanner;

class Employee {
	public int empid;
	private String name;
	private double salary;	
	public Employee() {
		
	}
	public Employee(int empid, String name, double salary) {
		this.empid=empid;
		this.name=name;
		this.salary=salary;
	}
	public void printEmployee() {
		System.out.println("EmployeeId: "+empid);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}
}
public class TestEmployee {

	public static void main(String[] args) {
		int arr[]= {12,10,55,6,2};
		
		Employee emp[]= {new Employee(1001,"Saurabh",3000),new Employee(1002,"Moulika",8000),new Employee(1003,"Rahul",13000)};

		/*for(int i=0; i<emp.length; i++) {
			emp[i].printEmployee();
			System.out.println("=========================");
		}*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee ID to find");
		int eid=sc.nextInt();
		boolean flag=false;
		for(Employee e:emp) {
			if(e.empid==eid) {
				e.printEmployee();
				flag=false;
				break;
			}
			else {
				flag=true;
			}
			
		}
		
		if(flag) {
			System.out.println("Given Employee ID is not available.");
		}
	}

}
