package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FindevenNumberinList {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10,1,2,3,4,5,6,9,10,11);
		/*//JDK 1.0 Imperative for loop
		for (int i = 0; i < list1.size(); i++) {
			int element = list1.get(i);
			if(element%2==0){
				evenList.add(element*2);
			}
		}
		*/
		
		//phase 1
		//Step1 : create Stream with Integer as generic since we are using Integers in list
		Stream<Integer> numberStream1 = numbers.stream();
	
		// check for the condition weather number is even or not
		//to check condition we will use predicate and writing annonymous inner classes and implements test method
		//which is taking one argument as input and boolean as outout
		//this is not lambda expression this is annymouns inner class
		
		/*Predicate<Integer> checkIsitEvenNumber = new Predicate<Integer>(){

			
			public boolean test(Integer t) {
				
				return t % 2 == 0;
			}
			
		};*/
		
		//Now are converting above annonymous inner class into Lambda expression
		
		Predicate<Integer> checkIsitEvenNumber = t  ->  t % 2==  0;// this is Lambda expression
		
		Stream<Integer> evenNumberStream = numberStream1.filter(checkIsitEvenNumber);
		
		// we need to double the number - take integer as input and return doubled value output
		Function<Integer,Integer> doubleEvenNumber = t -> t * 2;
		//each element on stream should be doubled
		Stream<Integer> evenNumberDoubledstream = evenNumberStream.map(doubleEvenNumber);
		
		evenNumberDoubledstream.forEach(t -> System.err.println(t));
		
		//phase 1 end
		
		
		//list1.forEach(number -> System.out.println(number));
		/*System.out.print("Even number list ");
		Stream<Integer> numberStream = numbers.stream();
		numberStream.filter(t -> t % 2==0).map(t -> t*2).forEach(t -> System.out.println(t));
		*/
		
		
		//System.out.print("Original list of elements ");
		/*for(Integer i :list1){
			System.out.print(i+" ");
		}
		System.out.println("\n");
		
		System.out.print("Even list of elements ");
		for(Integer i :evenList){
			System.out.print(i+" ");
		}*/
		
	}

}
