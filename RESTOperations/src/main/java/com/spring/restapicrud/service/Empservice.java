package com.spring.restapicrud.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.restapicrud.entity.Emp;
import com.spring.restpicrud.repository.Emprepository;



@Service
public class Empservice {
	@Autowired
	private Emprepository empr;
	
	public Emp saveEmp(Emp emp)
	{
		return empr.save(emp);
	}
	
	public List<Emp> saveAllEmp(List<Emp> employees)
	{
		return empr.saveAll(employees);
	}
	
	public List<Emp> getEmployees(){
		return empr.findAll();
	}
	
	public Emp getById(int id)
	{
		return empr.findById(id).orElse(null);
	}
	
	public Emp getByName(String name)
	{
		return empr.findByName(name);
	}
	
	public String deleteEmp(int id)
	{
		empr.deleteById(id);
		return "deleted"+id;
		
	}
	
	

	public Emp updateEmp(Emp emp)
	{
		Emp existingEmp=empr.findById(emp.getId()).orElse(null);
		existingEmp.setName(emp.getName());
		existingEmp.setAge(emp.getAge());
		existingEmp.setDesignation(emp.getDesignation());
		return empr.save(existingEmp);
	}
}
