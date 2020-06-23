package com.java.sort;

public class Mobile {
	
	public Mobile(){}
	public Mobile(String name, int price,float customerReview) {
      this.name = name;
      this.price = price;
      this.customerReview = customerReview;
	}
	
	private String name;
	
	private Integer price;
	
	private float customerReview;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public float getCustomerReview(){
		return customerReview;
	}
	
	public void setCustomerReview(float customerReview){
		this.customerReview=customerReview;
	}
	

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", price=" + price + " ,customerReview=" + customerReview + "]";
	}
	
	

}
