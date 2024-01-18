package com.spring.restpicrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.restapicrud.entity.Emp;
public interface Emprepository extends JpaRepository<Emp,Integer>{
	Emp findByName(String name);
	

}
