package com.ayyappa.demo.rabbit;

public class Rabbit {
	private String colour;
	private String sex;
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Rabbit(String colour, String sex) {
		super();
		this.colour = colour;
		this.sex = sex;
	}
	public Rabbit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
