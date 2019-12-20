package com.ayyappa.demo.alienRepo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import com.ayyappa.demo.alien.alien;

@Component
@Qualifier("work")
public class AlienDaoImpl{

	private NamedParameterJdbcTemplate template;
	AlienDaoImpl(NamedParameterJdbcTemplate template)
	{
		this.template=template;
	}
	public void setAlien(alien an) {
		// TODO Auto-generated method stub
		final String sql="INSERT INTO alien(aid, aname) VALUES(:aid,:aname)";
		KeyHolder holder=new GeneratedKeyHolder();
		SqlParameterSource param=new MapSqlParameterSource()
				.addValue("aid", an.getAid())
				.addValue("aname",an.getAname());
		template.update(sql, param, holder);
	}

}
