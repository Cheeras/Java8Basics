package com.java8;

public class InterfImpl2  {

	public static void main(String[] args) {
		//Interfadd impl = new InterfImpl2();
		//impl.m1(20,30);
		
		Interfadd impl2 = (a,b) -> System.out.println(a+b);
		impl2.m1(40, 90);
		
		//Interf interf = () -> System.out.println("I am from the Lambda expression m1() method");
		//interf.m1();
		
	}

}
