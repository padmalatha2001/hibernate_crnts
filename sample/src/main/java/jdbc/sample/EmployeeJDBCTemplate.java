package jdbc.sample;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeJDBCTemplate implements EmployeeDAO{
       private DataSource datasource;
       private JdbcTemplate jdbcobject;
       
       public void setdatasource(DataSource datasource)
       {
    	   this.datasource=datasource;
    	   this.jdbcobject=new JdbcTemplate(datasource);
       }
	   public void create(String ename,String dis,int age)
	   {
		   String SQL="insert into Employee(ename,dis,age) values(?,?,?)";
		   jdbcobject.update(SQL ,ename,dis,age);
		   System.out.println("Created record name="+ename+" desig="+dis+" Age="+age);
		   return;
		   
	   }
	   public List<Employee> listEmployees()
	   {
		   String SQL="select * from Employee";
		   List<Employee> em=jdbcobject.query(SQL, new EmployeeMapper());
		   return em;
	   }
}
