package com.spring.jdbc.Dao;

import java.lang.classfile.Signature.ThrowableSig;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.Entites.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insert(Student student) 
	{	
		String query="insert into student(id,name)values(?,?)";
    	
    	int res=this.jdbcTemplate.update(query,student.getId(),student.getName());
    	
		return res;
	}

	@Override
	public int update(Student student) {
		
		String query="update student set name=? where id=?";
		int res = this.jdbcTemplate.update(query,student.getName(),student.getId());
		
				return res;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int delete(int studentId) {
		 String query="delete from student where id=?";
		 int res = this.jdbcTemplate.update(query,studentId);
		return res;
	}

	@Override
	public Student getStudent(int studentId) {
			String queryString="select * from student where id =?";
			RowMapper<Student>rowMapper=new RowMapperImpl();
			Student student = this.jdbcTemplate.queryForObject(queryString,rowMapper,studentId);
		return student;
	}

	@Override
	public List<Student> getAllStudentds() {
		
		String query="select *from student";
		List<Student> students = this.jdbcTemplate.query(query,new RowMapperImpl());
		return students;
	}
	
	

}
