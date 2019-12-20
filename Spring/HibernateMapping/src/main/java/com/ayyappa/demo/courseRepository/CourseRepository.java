package com.ayyappa.demo.courseRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayyappa.demo.courseEntity.Course;
import com.sun.xml.bind.v2.model.core.ID;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
