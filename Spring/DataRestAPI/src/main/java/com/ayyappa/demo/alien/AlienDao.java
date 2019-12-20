package com.ayyappa.demo.alien;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="aliens",path="alien")
public interface AlienDao extends JpaRepository<Alien,Integer>{

}
