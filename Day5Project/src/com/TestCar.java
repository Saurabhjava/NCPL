package com;

abstract class Engine {
	public abstract void fType();
}

abstract class Car extends Engine {
	public abstract void changeGear(); 
	public abstract void lockingSystem(); 
	public final void noOfWheels() {
		System.out.println("4 Wheels");
	}
}

class Honda extends Car {
	@Override
	public void changeGear() {
		System.out.println("Automatic");		
	}

	@Override
	public void lockingSystem() {
		System.out.println("Key with Remote");
		
	}

	@Override
	public void fType() {
		// TODO Auto-generated method stub
		
	}
	
}
class Santro extends Car {
	@Override
	public void changeGear() {
		System.out.println("Manual");	
		
	}

	@Override
	public void lockingSystem() {
		System.out.println("With Key");	
		
	}

	@Override
	public void fType() {
		// TODO Auto-generated method stub
		
	}
	
}
public class TestCar {
	public static void main(String[] args) {
		String carName="Honda";
		System.out.println("===========Details of "+carName+"================");
		Honda h=new Honda();
		h.changeGear();
		h.lockingSystem();
		h.noOfWheels();
		carName="Santro";
		System.out.println("===========Details of "+carName+"================");
		Santro s=new Santro();
		s.changeGear();
		s.lockingSystem();
		s.noOfWheels();
	}
}
