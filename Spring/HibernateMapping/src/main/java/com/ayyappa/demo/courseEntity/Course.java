package com.ayyappa.demo.courseEntity;

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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ayyappa.demo.course_student.Student;
import com.ayyappa.demo.instructorEntity.Instructor;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="course")
public class Course {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="title")
	private String title;
	
	@ManyToOne(cascade= {
			CascadeType.DETACH,//
			CascadeType.MERGE,//
			CascadeType.PERSIST,//
			CascadeType.REFRESH//
	})
	@JoinColumn(name="instructor_id")
	private Instructor instructor;
	
	@ManyToMany(fetch=FetchType.LAZY,cascade= {
			CascadeType.DETACH,//
			CascadeType.MERGE,//
			CascadeType.PERSIST,//
			CascadeType.REFRESH
	})
	@JoinTable(
			name="course_student",//
			joinColumns=@JoinColumn(name="course_id"),//
			inverseJoinColumns=@JoinColumn(name="student_id")
			)
	private List<Student> student;

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public void addStudent(Student theStudent) {
		if(this.student==null) {
			student=new ArrayList<>();
		}
		student.add(theStudent);
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

	public Instructor getInstructor() {
		return instructor;
	}

	@JsonManagedReference
	public void setInstructor(Instructor instructor) {
		System.out.println(instructor);
		this.instructor = instructor;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", instructor=" + instructor + "]";
	}
	
	
}
