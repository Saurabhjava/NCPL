package org;

public class Main {

	public static void main(String[] args) {
		/*
		 * ICalculator cal=new Addition(); System.out.println(cal.calculate(15, 5));
		 * 
		 * cal=new Subtraction(); System.out.println(cal.calculate(15, 5));
		 * 
		 * cal=new Multiplication(); System.out.println(cal.calculate(15, 5));
		 */
		ICalculator cal=(x,y)->{
			System.out.println("Adding Two Nos");
			return x+y;
		};
		System.out.println(cal.calculate(15, 5));
		
		cal=(x,y)->x-y;
		System.out.println(cal.calculate(15, 5));
		
		cal=(x,y)->x*y;
		System.out.println(cal.calculate(15, 5));
	}

}
