package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
String brand;
int year;
String Model;
public Laptop() {
	super();
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getModel() {
	return Model;
}
public void setModel(String model) {
	Model = model;
}



}
