package com;

class Test {
	public void calculate(int a, int b) throws Exception {
		System.out.println("Calculating");
		System.out.println(a/b);
	}
	public void m1() throws Exception {
		calculate(20, 5);
	}
}
public class ReThrowExceptionDemo {

	public static void main(String[] args) throws Exception {
		Test obj=new Test();
		obj.m1();
		System.out.println("End Of Main");

	}

}
