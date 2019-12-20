package com.ayyappa.demo.mailentity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.ayyappa.demo.questionentity.QuestionEntity;

@Entity
@Table(name="dailyblinkz")
public class MailEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id",nullable=false)
	private long id;
	
	@Column(name="mail",nullable=false)
	private String mail;

	@Column(name="question_id")
	private int question_id;
	
	

	public MailEntity() {
		super();
	}

	@Override
	public String toString() {
		return "MailEntity [id=" + id + ", mail=" + mail + ", question_id=" + question_id + "]";
	}





	public MailEntity(long id, String mail, int question_id) {
		super();
		this.id = id;
		this.mail = mail;
		this.question_id = question_id;
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





	public int getQuestion_id() {
		return question_id;
	}





	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

}
