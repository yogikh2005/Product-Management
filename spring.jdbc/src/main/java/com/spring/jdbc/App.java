package com.spring.jdbc;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.Dao.StudentDao;
import com.spring.jdbc.Dao.StudentDaoImpl;
import com.spring.jdbc.Entites.Student;

public class App 
{
    public static void main( String[] args )
    {
    		
    	//ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/jdbc/jdbc.xml");
    
    	ApplicationContext context= new AnnotationConfigApplicationContext(config.class);
        
    	StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
    	
    	//Student student=new Student();
    	//student.setId(102);
    	//student.setName("Aaru");
    	
    	//int res=studentDao.insert(student);
    	//System.out.println("Row inserted "+res);
    	
    	
    	//student.setId(11);
    	//student.setName("yogi");
    	
    	//int res=studentDao.update(student);
    	//System.out.println("Row upadated"+res);
    	
    	//int res=studentDao.delete(11);
    	//System.out.println("Row deleted "+res);
    	
    	Student student2 = studentDao.getStudent(101);
    	System.out.println(student2);
    	
    	List<Student> students=studentDao.getAllStudentds();
    	for (Student s:students) {
    		System.out.println(s);
		}
    	 
    }
}
