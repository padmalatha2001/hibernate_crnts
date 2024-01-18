package jdbc.sample;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ap=new ClassPathXmlApplicationContext("NewFile.xml");
        EmployeeJDBCTemplate EmpJbbcTemp=(EmployeeJDBCTemplate) ap.getBean("EmpjdbcTemp");
        
        System.out.println("-----------Records Creation------------");
        EmpJbbcTemp.create("A", "ASSOSIATE", 22);
        EmpJbbcTemp.create("B", "DEVELOPER", 22);
        EmpJbbcTemp.create("C", "TESTER", 22);
        EmpJbbcTemp.create("D", "MANAGER", 22);
        
        System.out.println("--------Listing Multiple Records---------");
        
        List<Employee> emp=EmpJbbcTemp.listEmployees();
         for(Employee e:emp)
         {
        	 System.out.println("ID : "+e.getEid()+", EName "+e.getEname()+", Desgnation :"+e.getDis()+", Age"+e.getAge());
         }
    }
}
