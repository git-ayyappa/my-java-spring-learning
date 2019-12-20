package com.ayyappa.demo.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayyappa.demo.amigos.Amigos;
import com.ayyappa.demo.dao.AmigosDao;

@Service
public class AmigoService {

	@Autowired
	private AmigosDao amigosDao;
	
	public Collection<Amigos> findAll() {
		return (Collection<Amigos>) this.amigosDao.findAll();
	}

	public Optional<Amigos> findViewById(int id) {
		return this.amigosDao.findById(id);
	}

	public void save(Amigos amigos) {
		this.amigosDao.saveAndFlush(amigos);
	}

	public long count() {
		return this.amigosDao.count();
	}

	public void delete(int id) {
		this.amigosDao.deleteById(id);
	}

	public void deleteByBody(Amigos amigos) {
		this.amigosDao.delete(amigos);
	}

	public void deleteAll() {
		this.amigosDao.deleteAll();
	}

	public void emailNull() {
	}

	
}
