package com.spring.jdbcnew;

import java.util.List;

import javax.sql.DataSource;

import com.spring.jdbcnew.Student;

public interface StudentDAO {

	  public void setDataSource(DataSource ds);
	   
	   /** 
	      * This is the method to be used to create
	      * a record in the Student table.
	   */
	   public void create(String name, Integer age);
	   
	   /** 
	      * This is the method to be used to list down
	      * all the records from the Student table.
	   */
	   public List<Student> listStudents();

}
