package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {

	private int age;
	private String tech;
	private String info;
	@Autowired
	@Qualifier
	private Laptop laptop;
	
	public Alien() {
		super();
	}
	//setters and getter 
	public String getTech() {
		
		return tech;
	}
	public void setTech(String tech) {
		
		this.tech = tech;
	}
	public String getInfo() {
		
		return info;
	}
	public void setInfo(String info) {
		
		this.info = info;
	}
	public void show() {
		System.out.print("This is boot!");
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
