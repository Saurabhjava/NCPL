package com;

class Animal  {
	
	public  void eat() {
		System.out.println("Animal Eat....");
	}
}
class Dog extends Animal {

	public void eat() {
		System.out.println("Dog Eat....");
	}	
}

public class TestAnimal {

	public static void main(String[] args) {
		Dog obj=new Dog();
		obj.eat();
	}

}
