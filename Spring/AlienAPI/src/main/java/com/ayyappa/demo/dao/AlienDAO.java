package com.ayyappa.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

import com.ayyappa.demo.alien.Alien;

public interface AlienDAO extends JpaRepository<Alien,Integer>{

}
