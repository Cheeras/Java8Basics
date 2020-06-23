package com.java.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortMobileBasedonNameTypeReview {
	
	public static void main(String[] args) {
		Mobile m1 = new Mobile("Samsung", 12000, 4.2f);
		Mobile m2 = new Mobile("LG", 15500, 4.5f);
		Mobile m3 = new Mobile("Motorola", 11000, 4.3f);
		Mobile m4 = new Mobile("Lenova", 14000, 4f);
		Mobile m5 = new Mobile("Apple", 50000, 4.6f);
		Mobile m6 = new Mobile("Karbon", 8000, 4.2f);
		
		List<Mobile> listOfMobile = Arrays.asList(m1,m2,m3,m4,m5,m6);
		/*Collections.sort(listOfMobile, new Comparator<Mobile>(){
			//sorting based on mobile names
			public int compare(Mobile o1, Mobile o2) {
				
				return o1.getName().compareTo(o2.getName());
			}
			
		});*/
		
		Comparator<Mobile> sortingBasedOnMobileName = (mm1,mm2) -> mm1.getName().compareTo(mm2.getName());
		Collections.sort(listOfMobile,sortingBasedOnMobileName);
		System.out.println("Sorting Mobiles based on Name");
		/*for(Mobile listOfMob : listOfMobile ){
			System.out.println(listOfMob);
			//System.out.println(listOfMob.getCustomerReview());
		}*/
		listOfMobile.stream().forEach(System.out::println);
		/*System.err.println("====================================================");
		Comparator<Mobile> sortingBasedOnMobilePrice = (mm1,mm2) -> mm1.getPrice()- mm2.getPrice();
		Collections.sort(listOfMobile,sortingBasedOnMobilePrice);
		
		System.out.println("Sorting Mobiles based on Price");
		for(Mobile listOfMob : listOfMobile ){
			System.out.println(listOfMob);
			//System.out.println(listOfMob.getCustomerReview());
		}
		System.err.println("====================================================");
		
		Comparator<Mobile> sortingBasedOnCustomerReview = (mm1,mm2) -> Float.compare(mm1.getCustomerReview(), mm2.getCustomerReview());
		Collections.sort(listOfMobile,sortingBasedOnCustomerReview);
		
		System.out.println("Sorting Mobiles based on Customer Review");
		for(Mobile listOfMob : listOfMobile ){
			System.out.println(listOfMob);
			//System.out.println(listOfMob.getCustomerReview());
		}*/
	}

}
