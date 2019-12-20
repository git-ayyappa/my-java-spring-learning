package com.ayyappa.demo.CourseRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayyappa.demo.Course.Course;
import com.sun.xml.bind.v2.model.core.ID;

@Repository
public interface CourseRepo extends JpaRepository<Course, Long> {

}
