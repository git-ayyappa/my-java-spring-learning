package com.ayyappa.demo.model;

public class MailModel {
	private int question_id;
	
	private String mail;
	
	private long id;
	
	public MailModel() {
		super();
	}

	public MailModel(String mail,int question_id,long id) {
		super();
		this.mail = mail;
		this.question_id=question_id;
		this.id=id;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "MailModel [question_id=" + question_id + ", mail=" + mail + ", id=" + id + "]";
	}
	
}
