package com.ayyappa.demo.alienRepo;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.ayyappa.demo.alien.alien;

@Repository
@Qualifier("repo")
public interface AlienDao extends JpaRepository<alien,Integer>{

	List<alien> findByAname(String string);

	@Query("from alien")
	List<alien> myQuery();

	//public void setAlien(alien an);
}
