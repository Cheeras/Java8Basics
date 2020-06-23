package com.java.basics;

import java.util.ArrayList;
import java.util.List;

public class FindevenNumberinList {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> evenList = new ArrayList<Integer>();
		
		list1.add(10);
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(9);
		list1.add(10);
		list1.add(11);
		//JDK 1.0 Imperative for loop
		for (int i = 0; i < list1.size(); i++) {
			int element = list1.get(i);
			if(element%2==0){
				evenList.add(element*2);
			}
		}
		System.out.print("Original list of elements ");
		for(Integer i :list1){
			System.out.print(i+" ");
		}
		System.out.println("\n");
		
		System.out.print("Even list of elements ");
		for(Integer i :evenList){
			System.out.print(i+" ");
		}
		
	}

}
