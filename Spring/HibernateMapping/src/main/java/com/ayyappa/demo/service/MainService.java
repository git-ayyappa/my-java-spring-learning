package com.ayyappa.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayyappa.demo.courseEntity.Course;
import com.ayyappa.demo.courseRepository.CourseRepository;
import com.ayyappa.demo.course_student.Student;
import com.ayyappa.demo.instructorDetailEntity.InstructorDetail;
import com.ayyappa.demo.instructorEntity.Instructor;
import com.ayyappa.demo.instructor_detail_repository.InstructorDetailRepository;
import com.ayyappa.demo.repository.MainRepository;

@Service
public class MainService {
	
	
	@Autowired
	private MainRepository repo;
	
	@Autowired
	private InstructorDetailRepository repoIND;
	
	@Autowired
	private CourseRepository repoCourse;
	
	public void getValues() {
		
	}
	public void saveValues(String firstName, String lastName, String email, String youtube, String hobby) {
		Instructor instructor=new Instructor(firstName,lastName,email);
		
		InstructorDetail instructorDetail=new InstructorDetail(youtube,hobby);
		
		instructor.setInstructorDetail(instructorDetail);
		System.out.println(instructor);
		repo.save(instructor);
	
	}
	public Optional<Instructor> findById(long id) {
		return repo.findById(id);
	}
	public List<Instructor> findAll() {
		return this.repo.findAll();
	}
	public void deleteById(long id) {
		this.repo.deleteById(id);
		
	}
	public Optional<Instructor> findByIdInstructorDetail(long id) {
		Optional<InstructorDetail> hello=this.repoIND.findById(id);
		return repo.findById(hello.get().getInstructor().getId());
	}
	
	public Instructor addCourses(long id,String title) {
		Optional<Instructor>OptionalIns=repo.findById(id);
		Course tempCourse=new Course(title);
		tempCourse.setInstructor(OptionalIns.get());
		repoCourse.save(tempCourse);
		OptionalIns.get().addCourse(tempCourse);
		System.out.println(tempCourse.getInstructor());
		return tempCourse.getInstructor();

	}
	public void hello(String firstName, String lastName, String email, String title) {
		Course tempCourse=new Course(title);
		Student student=new Student(firstName,lastName,email);
		tempCourse.addStudent(student);
	}
}
