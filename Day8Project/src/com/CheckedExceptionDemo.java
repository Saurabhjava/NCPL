package com;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		String str="HEllO";
		try {
			System.out.println("Started");
			System.out.println(str.toLowerCase());
			System.out.println(10/0);
			System.out.println("End Of Method");
		} catch (ArithmeticException e) {
			System.out.println("Error in Div");
			return;
		} 
		catch (Exception e) {
			System.out.println("Error in NULL value");
			return;
		}
		finally {
			System.out.println("End Of Main");
		}
	}

}
