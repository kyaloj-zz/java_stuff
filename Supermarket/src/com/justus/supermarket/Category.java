package com.justus.supermarket;

public class Category {

	Category[] subcategories;
	Commodity[] commodities;
	String name;
	public Category(String name, Category[] subcategories, Commodity[] commodities){
		  this.name = name;
		  this.subcategories = subcategories;
		  this.commodities = commodities;
	  }
	public Category[] getSubcategories() {
		return subcategories;
	}
	public void setSubcategories(Category[] subcategories) {
		this.subcategories = subcategories;
	}
	public Commodity[] getCommodities() {
		return commodities;
	}
	public void setCommodities(Commodity[] commodities) {
		this.commodities = commodities;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
