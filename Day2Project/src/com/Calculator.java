package com;

public class Calculator {
	public int calculate(int num1, int num2) {
		System.out.println("Doing Calculation1 Method.....");
		return num1+num2;
	}
	public int calculate(int num1, int num2, int num3) {
		System.out.println("Doing Calculation2 Method.....");
		return num1+num2+num3;
	}
	public float calculate(float num1, float num2) {
		System.out.println("Doing Calculation3 Method.....");
		return num1+num2;
	}
	public float calculate(int num1,float num2) {
		System.out.println("Doing Calculation4 Method.....");
		return num1+num2;
	}
	public float calculate(float num1,int num2) {
		System.out.println("Doing Calculation5 Method.....");
		return num1+num2;
	}

	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		System.out.println(cal.calculate(12.3f,15.5f));
		
		
	}

}
