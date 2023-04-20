package com;
class Animal {
	public void eat() {
		System.out.println("Animal Eat");
	}
}
class Dog extends Animal {
	@Override
	public void eat() {
		//super.eat();
		System.out.println("Dog Eat");
	}
	public void bark() {
		System.out.println("Dog Bark");
	}
}
public class TestAnimal {

	public static void main(String[] args) {
		Animal obj=new Animal();
		obj.eat();		
		//obj=new Dog();
		obj.eat();
		if(obj instanceof Dog)
			((Dog)obj).bark();
		else
			System.out.println("Dog Object is not available");
		

	}

}
