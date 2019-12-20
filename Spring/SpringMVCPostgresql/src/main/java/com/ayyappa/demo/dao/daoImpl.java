package com.ayyappa.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import com.ayyappa.demo.model.person;

@Component
@Qualifier("postgresql")
public class daoImpl implements daoInterface{
	private NamedParameterJdbcTemplate template;

	daoImpl(NamedParameterJdbcTemplate template){
		this.template=template;
	}

	@Override
	public void save(person p) {
		System.out.println(p.getId()+" "+p.getFirst_name()+" "+p.getLast_name());
		final String sql="INSERT INTO Person(id, first_name, last_name) VALUES(:id, :first_name, :last_name)";
		KeyHolder holder=new GeneratedKeyHolder();
		SqlParameterSource param=new MapSqlParameterSource()
				.addValue("id",p.getId())
				.addValue("first_name",p.getFirst_name())
				.addValue("last_name",p.getLast_name());
		template.update(sql, param, holder);
	}

	@Override
	public List<person> getAll() {
		return template.query("select * from person", new personRowMapper());
	}

}
