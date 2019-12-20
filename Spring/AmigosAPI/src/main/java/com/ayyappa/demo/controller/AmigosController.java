package com.ayyappa.demo.controller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ayyappa.demo.amigos.Amigos;
import com.ayyappa.demo.service.AmigoService;

@RestController
@RequestMapping(value="/amigos")
public class AmigosController {
	
	@Autowired
	AmigoService amigoService;
	
	@RequestMapping(method=RequestMethod.GET)
	public Collection<Amigos> findAll()
	{
		return this.amigoService.findAll();
	}
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Optional<Amigos> findViewById(@PathVariable("id") int id)
	{
		return this.amigoService.findViewById(id);
		
	}
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void set(@RequestBody Amigos amigos)
	{
		this.amigoService.save(amigos);
	}
	@RequestMapping(value="/count", method=RequestMethod.GET)
	public long count()
	{
		return this.amigoService.count();
	}
	@RequestMapping(value="{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable int id)
	{
		this.amigoService.delete(id);
	}
	@RequestMapping(method=RequestMethod.DELETE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public void deleteByBody(@RequestBody Amigos amigos)
	{
		this.amigoService.deleteByBody(amigos);
	}
	@RequestMapping(value="/deleteAll",method=RequestMethod.DELETE)
	public void deleteAll()
	{
		this.amigoService.deleteAll();
	}
	@RequestMapping(value="/emailNull",method=RequestMethod.GET)
	public void emailNull()
	{
		this.amigoService.emailNull();
	}
}
