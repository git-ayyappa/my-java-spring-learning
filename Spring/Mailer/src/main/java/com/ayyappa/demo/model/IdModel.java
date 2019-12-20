package com.ayyappa.demo.model;

public class IdModel {
	private long id;
	
	public IdModel() {
		super();
	}

	public IdModel(long id) {
		super();
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "IdModel [id=" + id + "]";
	}
	
}
