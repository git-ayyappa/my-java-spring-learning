package com.ayyappa.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.ayyappa.demo.model.person;

public interface daoInterface{

	public void save(person psn);
	public List<person> getAll();
}
