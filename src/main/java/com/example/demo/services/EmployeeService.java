package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.kodemp;
import com.example.demo.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repo;
	
	public kodemp readEmployeeById(int id) {
		return repo.findById(id).orElse(null);
		
	}
	
	public List<kodemp> readAllEmployee(){
		return repo.findAll();
	}
	
	public kodemp onboardEmployee(kodemp employee) {
		return repo.save(employee);
	}
	
	public String deleteEmployeeById(int id) {
		repo.deleteById(id);
		return "Deleted Record";
	}
	
	public kodemp updateEmployeeById(kodemp emp) {
		return repo.save(emp);
	}
}
