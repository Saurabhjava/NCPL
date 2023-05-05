package com;

class Animal {
	public void eat() {
		System.out.println("Animal Eat");
	}
}
public class AnnonymousDemo {

	public static void main(String[] args) {
		
		Animal dog=new Animal() {
			public void eat() {
				System.out.println("Dog Eat");
				display();
			}
			public void display() {
				System.out.println("Display Method");
				play();
			}
			public void play() {
				System.out.println("Play.....");
			}
		};
		dog.eat();
		//dog.display();
	
		
		Animal cow=new Animal() {
			public void eat() {
				System.out.println("Cow Eat");
			}
		};
		cow.eat();
	}

}
