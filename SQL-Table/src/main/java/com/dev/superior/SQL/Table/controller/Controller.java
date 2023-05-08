package com.dev.superior.SQL.Table.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.superior.SQL.Table.entities.Employees;
import com.dev.superior.SQL.Table.repositories.UserRepository;





@RestController
@RequestMapping (value = "/employees")
public class Controller {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping
	public List<Employees> findAll(){
		List<Employees> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public Employees findById(@PathVariable Long id) {
		Employees result = repository.findById(id).get();
		return result;
	}
	
	@PostMapping
	public Employees insert(@RequestBody Employees employees) {
		Employees result = repository.save(employees);
		return result;
	}


	
	
	

}
