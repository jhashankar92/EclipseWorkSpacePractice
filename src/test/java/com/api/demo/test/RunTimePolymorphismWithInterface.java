package com.api.demo.test;

interface Vehicle {
	void start();  //abstract no body
}

class Bike implements Vehicle{
	public void start() {
		System.out.println("Bike Start with Kick");
	}
}

class Car implements Vehicle{
	public void start() {
		System.out.println("Car Start with Key");		
	}
}

public class RunTimePolymorphismWithInterface {

	public static void main(String[] args) {
		Vehicle bike=new Bike(); //polymorphism feature
		bike.start();
		Vehicle car=new Car();
		car.start();
	}

}
