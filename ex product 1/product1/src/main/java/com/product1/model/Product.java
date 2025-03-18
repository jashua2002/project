package com.product1.model;

import org.springframework.web.bind.annotation.PathVariable;


import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity

public class Product {
    @Id
    private int id;
    private String name;
	private long price;
	private double rating;
	
	public Product() {
	super();
}
	public Product(int id, String name, long price, double rating) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.rating = rating;
}
	public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getPrice() {
	return price;
}
public void setPrice(long price) {
	this.price = price;
}
public double getRating() {
	return rating;
}
public void setRating(double rating) {
	this.rating = rating;
}}
	
	 