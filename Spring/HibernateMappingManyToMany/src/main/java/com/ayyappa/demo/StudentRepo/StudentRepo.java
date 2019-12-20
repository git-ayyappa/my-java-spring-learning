package com.ayyappa.demo.StudentRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayyappa.demo.Course.Student;
import com.sun.xml.bind.v2.model.core.ID;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

}
