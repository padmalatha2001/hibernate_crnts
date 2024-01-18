package com.spring.restapicrud.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.spring.restapicrud.entity.Emp;
import com.spring.restapicrud.service.Empservice;


@RestController
public class Empcontroller {
	@Autowired
	private Empservice emService;
	
//	http://localhost:8080/Emp
	@PostMapping("/Emp")
	public Emp addEmp(@RequestBody Emp emp)
	{
		return emService.saveEmp(emp);
	}
	
//	http://localhost:8080/Employees
	@PostMapping("/Employees")
	public List<Emp> addPets(@RequestBody List<Emp> employees){
		return emService.saveAllEmp(employees);
	}
	
//	http://localhost:8080/getEmployees
	@GetMapping("/getEmployees")
	public List<Emp> findAllEmployees(){
		return emService.getEmployees();
	}
	
//	http://localhost:8080/getEmpById/4
	@GetMapping("/getEmpById/{id}")
	public Emp getPetById(@PathVariable int id) {
		return emService.getById(id);
	}
	
//	http://localhost:8080/getEmpByName/ravi
	@GetMapping("/getEmpByName/{name}")
	public Emp getPetByName(@PathVariable String name) {
		return emService.getByName(name);
	}
	
//	http://localhost:8080/updateEmp
	@PutMapping("/updateEmp")
	public Emp updatePet(@RequestBody Emp emp) {
		return emService.updateEmp(emp);
	}
	
//	http://localhost:8080/deleteEmp/1
	@DeleteMapping("/deleteEmp/{id}")
	public String deleteEmp(@PathVariable int id) {
		return emService.deleteEmp(id);
	}

	

}
