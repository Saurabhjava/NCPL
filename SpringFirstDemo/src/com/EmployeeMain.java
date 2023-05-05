package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		/*Employee emp=new Employee();
		emp.setAddress(new Address());
		emp.printEmployeeDetails();*/
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(EmployeeCofig.class);
		
		Employee emp=(Employee)ctx.getBean("employee");
		emp.printEmployeeDetails();
		System.out.println("**************Employee 2 Details******************");
		Employee emp1=(Employee)ctx.getBean("employee");
		emp1.setEmpid(102);
		emp1.setName("Saurabh");
		emp1.setEmail("saurabh@gmail.com");
		Address add=(Address)ctx.getBean("address");
		add.setCity("Delhi");
		add.setCountry("India");
		add.setZip(201301);
		emp1.printEmployeeDetails();

	}

}
