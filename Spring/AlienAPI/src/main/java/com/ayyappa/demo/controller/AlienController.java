package com.ayyappa.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayyappa.demo.alien.Alien;
import com.ayyappa.demo.dao.AlienDAO;

@RestController
public class AlienController {
	@Autowired
	AlienDAO dao;
	
	@GetMapping(value="/alien")
	public List<Alien> getAlien()
	{
		return this.dao.findAll();
	}
	@PostMapping(value="/alien")
	public Alien postAlien(@RequestBody Alien alien)
	{
		this.dao.save(alien);
		return alien;
	}
	@RequestMapping(value="/alien/{id}")
	public Optional<Alien> getalienId(@PathVariable int id)
	{
		return this.dao.findById(id);
	}
	@DeleteMapping(value="/alien/{id}")
	public boolean DeleteAlien(@PathVariable int id)
	{
		Alien alien=this.dao.getOne(id);
		this.dao.delete(alien);
		return true;
	}
	@PutMapping(value="/alien")
	public boolean SaveorUpdateAlien(@RequestBody Alien alien)
	{
		this.dao.save(alien);
		return true;
	}
}
