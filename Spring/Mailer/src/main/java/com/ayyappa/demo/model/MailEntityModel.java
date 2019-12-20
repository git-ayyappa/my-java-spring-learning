package com.ayyappa.demo.model;

public class MailEntityModel {
	private long id;
	private String mail;
	public MailEntityModel() {
		super();
	}
	public MailEntityModel(long id, String mail) {
		super();
		this.id = id;
		this.mail = mail;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "MailEntityModel [id=" + id + ", mail=" + mail + "]";
	}
	
}
