package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.Dao.StudentDao;
import com.spring.jdbc.Dao.StudentDaoImpl;

@Configuration
@ComponentScan(" com.spring.jdbc.Dao")
public class config {
	@Bean("ds")
	public DataSource getDataSource()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/jdbc");
		ds.setUsername("root");
		ds.setPassword("");
		return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate()
	{
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		
		return jdbcTemplate;
	}
	/*
	@Bean("studentDao")
	public StudentDao getStudentDao()
	{
		StudentDaoImpl sd=new StudentDaoImpl();
		sd.setJdbcTemplate(getTemplate());
		return sd;
		
	}
*/	
	

}
