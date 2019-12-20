package com.ayyappa.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.ayyappa.demo.model.Aliens;

import antlr.collections.List;

public interface ALiensRepo extends CrudRepository<Aliens,Integer>{
	
}
