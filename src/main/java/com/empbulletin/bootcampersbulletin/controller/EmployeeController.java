package com.empbulletin.bootcampersbulletin.controller;

import java.util.List;

import com.empbulletin.bootcampersbulletin.exception.ResourceNotFoundException;
import com.empbulletin.bootcampersbulletin.model.Interview;
import com.empbulletin.bootcampersbulletin.model.Marks;
import com.empbulletin.bootcampersbulletin.repository.InterviewRepository;
import com.empbulletin.bootcampersbulletin.repository.MarksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


import com.empbulletin.bootcampersbulletin.model.Employee;
import com.empbulletin.bootcampersbulletin.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1/employees")

public class EmployeeController {

	@Autowired
	private EmployeeRepository eR;
	@Autowired
	private MarksRepository mR;

	@Autowired
	private InterviewRepository iR;
	
	@GetMapping
	public List<Employee> getAllEmployees() {
		return eR.findAll();
	}
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable Long id) {
		Optional<Employee> employee = eR.findById(id);
		if (employee.isPresent()) {
			return employee.get();
		} else {
			// Handle the case where employee with given id doesn't exist
			throw new ResourceNotFoundException("Employee with id " + id + " not found");
		}
	}

	@GetMapping("/batch/{batchNo}")
	public List<Employee> getEmployeesByBatch(@PathVariable Integer batchNo) {
		return eR.findByBatchNo(batchNo);
	}
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Employee createEmployee(@RequestBody Employee employee) {
		return eR.save(employee);
	}

//	@GetMapping("/{empId}/interview")
//	public Interview getInterviewForEmployee(@PathVariable Long empId) {
//		Optional<Employee> employeeOptional = eR.findById(empId);
//		if (employeeOptional.isPresent()) {
//			Employee employee = employeeOptional.get();
//			// Assuming there's a method in the Employee entity to get the interview
//			// You might need to adjust this according to your entity structure
//			return employee.getInterview();
//		} else {
//			// Handle the case where employee with given id doesn't exist
//			throw new ResourceNotFoundException("Employee with id " + empId + " not found");
//		}
//	}
//
//	@GetMapping("/{empId}/marks")
//	public Marks getMarksForEmployee(@PathVariable Long empId) {
//		Optional<Employee> employeeOptional = eR.findById(empId);
//		if (employeeOptional.isPresent()) {
//			Employee employee = employeeOptional.get();
//			// Assuming there's a method in the Employee entity to get the marks
//			// You might need to adjust this according to your entity structure
//			return employee.getMarks();
//		} else {
//			// Handle the case where employee with given id doesn't exist
//			throw new ResourceNotFoundException("Employee with id " + empId + " not found");
//		}
//	}





}
