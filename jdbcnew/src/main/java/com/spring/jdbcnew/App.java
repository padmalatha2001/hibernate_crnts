package com.spring.jdbcnew;

/**
 * Hello world!
 *
 */
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbcnew.Student;
import com.spring.jdbcnew.StudentJDBCTemplate;
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ap=new ClassPathXmlApplicationContext("Beans.xml");
        
        StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate)
                ap.getBean("studentJDBCTemplate");
             
             System.out.println("------Records Creation--------" );
             studentJDBCTemplate.create("mahi", 11);
             studentJDBCTemplate.create("pandu", 2);
             studentJDBCTemplate.create("krish", 15);

             System.out.println("------Listing Multiple Records--------" );
             List<Student> students = studentJDBCTemplate.listStudents();
             
             for (Student record : students) {
                 System.out.print("ID : " + record.getId() );
                 System.out.print(", Name : " + record.getName() );
                 System.out.println(", Age : " + record.getAge());
    }
}
}