package com.ayyappa.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ayyappa.demo.amigos.Amigos;

public interface AmigosDao extends JpaRepository<Amigos,Integer>{
	
}
