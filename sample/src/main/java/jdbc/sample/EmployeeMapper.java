package jdbc.sample;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee>{
	
	public Employee mapRow(ResultSet rs,int RowNum) throws SQLException{
		Employee e=new Employee();
		e.setEid(rs.getInt("eid"));
		e.setEname(rs.getString("ename"));
		e.setDis(rs.getString("dis"));
		e.setAge(rs.getInt("age"));
		return e;
		
	}

}
