package com.api.demo.test;
//example of run time polymorphism
//Method overriding---same method name, same parameter, but different implementation
 class Animal{
	 void makeSound() {
		 System.out.println("Animal Makes Sound");
	 }
 }

 class Dog extends Animal{
	 void makeSound() {
		 System.out.println("Dog Bark");
	 }
 }

public class RunTimePolymorphism {
	public static void main(String[] args) {
		Animal myanimal=new Dog(); //upcasting
		myanimal.makeSound();  //calls dog overriden method
	}
}
