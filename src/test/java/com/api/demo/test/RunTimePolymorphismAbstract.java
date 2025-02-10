package com.api.demo.test;

abstract class MotorVehicle{
	abstract void start();// abstract method must be overridden
	void noise() { // concrete method already implemented
		System.out.println("Vehicle can make noise by Honking");
	}	
}

class BMW extends MotorVehicle{	
	void start() {
		System.out.println("BMW Start with Key and Self Start");		
	}
}

class TATANano extends MotorVehicle{
	void start() {
		System.out.println("Tata Nano Starts with Only Key");
	}
}


public class RunTimePolymorphismAbstract {

	public static void main(String[] args) {
		MotorVehicle bmw=new BMW();
		bmw.start();
		bmw.noise();
		
		MotorVehicle tata=new TATANano();
		tata.start();
		tata.noise();
		

	}

}
