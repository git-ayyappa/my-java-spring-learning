package com.example.demo;

import org.springframework.stereotype.Component;

@Component("laptop")
public class Laptop {
	private int sno;
	private String model;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Laptop [sno=" + sno + ", model=" + model + "]";
	}
	
	public void compile()
	{
		System.out.println("Compiling....");
	}
}
