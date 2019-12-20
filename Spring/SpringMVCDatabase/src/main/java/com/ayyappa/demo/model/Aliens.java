package com.ayyappa.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aliens {
	@Id
	private int aid;
	private String aname;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	@Override
	public String toString() {
		return "Aliens [aid=" + aid + ", aname=" + aname + "]";
	}
	
}
