package com;

public class Animal {
	
	public Animal() {
		System.out.println("No-Parameter Constructor");
	}
	public Animal(String food) {
		this(1);
		System.out.println("Constructor With STRING");
	}
	public Animal(int age) {
		this();
		System.out.println("Constructor With INT");
	}
	public void eat() {
		System.out.println("Animal Eat");
	}
}
class TestAnimal {
	public static void main(String[] args) {
		//Animal obj1=new Animal();
		Animal obj=new Animal("abcd");
		obj.eat();

	}

}
