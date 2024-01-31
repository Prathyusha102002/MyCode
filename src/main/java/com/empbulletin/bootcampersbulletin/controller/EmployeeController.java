package com.empbulletin.bootcampersbulletin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empbulletin.bootcampersbulletin.model.Employee;
import com.empbulletin.bootcampersbulletin.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1/employees")

public class EmployeeController {

	@Autowired
	private EmployeeRepository eR;
	
	@GetMapping
	public List<Employee> getAllEmployees() {
		return eR.findAll();
	}
	
}
