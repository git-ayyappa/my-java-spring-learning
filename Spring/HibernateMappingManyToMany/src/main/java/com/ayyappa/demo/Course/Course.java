package com.ayyappa.demo.Course;

import java.util.ArrayList;
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

@Entity
@Table(name="course")
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="title")
	private String title;
	
	@ManyToMany(fetch=FetchType.LAZY,cascade= {
			CascadeType.DETACH,//
			CascadeType.MERGE,//
			CascadeType.PERSIST,//
			CascadeType.REFRESH
	})
	@JoinTable(name="course_student",//
		joinColumns=@JoinColumn(name="course_id"),//
		inverseJoinColumns=@JoinColumn(name="student_id")
			)
	private List<Student> students;
	
	public void addStudent(Student theStudent) {
		if(students==null) {
			students=new ArrayList<>();
		}
		students.add(theStudent);
	}

	public Course() {
		super();
	}

	public Course(String title) {
		super();
		this.title = title;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
	
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + "]";
	}
	
	
}
