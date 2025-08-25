package com.tnsif.day08.interfaces.functionalinterfaces;

public class GreetClass implements GreetInterface {

	@Override
	public String greet() {		
		return "Welcome to the world of Java";
	}
	public void display();{
		Systemout.println("Method in interrface");
	}

}