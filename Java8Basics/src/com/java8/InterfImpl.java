package com.java8;

public class InterfImpl implements Interf {

	@Override
	public void m1() {
		System.out.println("I am from m1() method");

	}
	
	public static void main(String[] args) {
		Interf impl = new InterfImpl();
		impl.m1();
		
		Interf interf = () -> System.out.println("I am from the Lambda expression m1() method");
		interf.m1();
		
	}

}
