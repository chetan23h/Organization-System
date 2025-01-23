package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.kodemp;
import com.example.demo.services.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	EmployeeService empserv;
	
	@GetMapping("/emp/byid/{id}")
	public kodemp findEmpById(@PathVariable("id") int id) {
		return empserv.readEmployeeById(id);
	}

	@GetMapping("/emp/all")
	public List<kodemp> findAllEmp() {
		return empserv.readAllEmployee();
	}
	
	@PostMapping("/emp/onboard")
	public kodemp onBoardEmp(@RequestBody kodemp kod) {
		return empserv.onboardEmployee(kod);
	}
	
	@DeleteMapping("/emp/remove/{id}")
	public String deleteEmpById(@PathVariable("id") int id) {
		return empserv.deleteEmployeeById(id);
	}
	
	@PutMapping("/emp/update")
	public kodemp updateEmpById(@RequestBody kodemp emp) {
		return empserv.updateEmployeeById(emp);
	}
	
	
	
}
