package com.ayyappa.demo.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayyappa.demo.instructorEntity.Instructor;

@Repository
public interface MainRepository extends JpaRepository<Instructor,Long>{
	
}
