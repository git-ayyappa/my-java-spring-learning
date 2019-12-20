package com.ayyappa.demo.course_student;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.ayyappa.demo.courseEntity.Course;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;

	@Column(name="email")
	private String email;
	
	@ManyToMany(fetch=FetchType.LAZY,cascade= {
			CascadeType.DETACH,//
			CascadeType.MERGE,//
			CascadeType.PERSIST,//
			CascadeType.REFRESH
	})
	@JoinTable(name="course_student",//
			joinColumns=@JoinColumn(name="student_id"),//
			inverseJoinColumns=@JoinColumn(name="course_id")
	)
	private List<Course> courses;
	
	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Student() {
		super();
	}

	public Student(String first_name, String last_name,String email) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email=email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + "]";
	}
	
	

}
