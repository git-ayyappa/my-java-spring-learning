package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Mojo {
	private int id;
	private String Name;
	private String course;
	@Autowired
	@Qualifier("laptop")
	private Laptop laptop;
	
	public Mojo(int id, String name, String course) {
		super();
		this.id = id;
		Name = name;
		this.course = course;
	}
	
	public Mojo() {
		super();
		System.out.println("Hi created object");
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Mojo [id=" + id + ", Name=" + Name + ", course=" + course + "]";
	}
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("HI there");
		laptop.compile();
		
	}
	
}
