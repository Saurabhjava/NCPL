package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*class PredicateDemo implements Predicate<Employee> {

	@Override
	public boolean test(Employee t) {
		if(t.getName().startsWith("M"))
			return true;
		else
			return false;
	}
	
}*/
public class StreamDemo {

	public static void main(String[] args) {
		List<Employee> li=new ArrayList<Employee>();
		
		li.add(new Employee(101,"Andrew",5000));
		li.add(new Employee(102,"Rahul",7000));
		li.add(new Employee(103,"Mark",3000));
		li.add(new Employee(104,"Amit",8000));
		li.add(new Employee(105,"Moulika",2500));

		/*
		 * li.forEach(e->{ if(e.getSalary()<=5000) { System.out.println(e); } });
		 */
		//Predicate<Employee> p=(e)->e.getName().startsWith("A");
		//li.stream().filter(e->e.getName().startsWith("A")).forEach(e->System.out.println(e));
		
		li.stream().filter(e->e.getSalary()<5000).forEach(e->System.out.println(e));
	}

}
