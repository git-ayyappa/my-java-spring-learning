package com.ayyappa.demo.course_instructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course_student")
public class CourseStudent {
	@Id
	@Column(name="course_id")
	private long course_id;
	
	@Id
	@Column(name="student_id")
	private long student_id;

	public CourseStudent() {
		super();
	}

	public CourseStudent(long course_id, long student_id) {
		super();
		this.course_id = course_id;
		this.student_id = student_id;
	}

	public long getCourse_id() {
		return course_id;
	}

	public void setCourse_id(long course_id) {
		this.course_id = course_id;
	}

	public long getStudent_id() {
		return student_id;
	}

	public void setStudent_id(long student_id) {
		this.student_id = student_id;
	}

	@Override
	public String toString() {
		return "CourseStudent [course_id=" + course_id + ", student_id=" + student_id + "]";
	}
	
	
}
