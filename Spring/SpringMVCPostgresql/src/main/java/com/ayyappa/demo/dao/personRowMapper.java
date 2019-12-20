package com.ayyappa.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import com.ayyappa.demo.model.person;

public class personRowMapper implements RowMapper<person> {

	public person processRow(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		person psn=new person();
		psn.setId(Integer.parseInt(rs.getString(0)));
		psn.setFirst_name(rs.getString(1));
		psn.setLast_name(rs.getString(2));
		return psn;
	}

	@Override
	public person mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		person psn=new person();
		psn.setId(Integer.parseInt(rs.getString("id")));
		psn.setFirst_name(rs.getString("first_name"));
		psn.setLast_name(rs.getString("last_name"));
		return psn;
	}

}
