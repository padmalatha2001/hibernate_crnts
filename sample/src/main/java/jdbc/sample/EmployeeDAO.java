package jdbc.sample;

import java.util.List;

import javax.sql.DataSource;

public interface EmployeeDAO {
	public void setdatasource(DataSource ds);
	
	public void create(String ename,String dis,int age);
	
	public List<Employee> listEmployees();

}
