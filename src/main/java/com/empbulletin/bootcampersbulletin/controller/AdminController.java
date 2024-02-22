package com.empbulletin.bootcampersbulletin.controller;
import com.empbulletin.bootcampersbulletin.exception.ResourceNotFoundException;
import com.empbulletin.bootcampersbulletin.model.Employee;
import com.empbulletin.bootcampersbulletin.model.Interview;
import com.empbulletin.bootcampersbulletin.model.Marks;
import com.empbulletin.bootcampersbulletin.repository.EmployeeRepository;
import com.empbulletin.bootcampersbulletin.repository.InterviewRepository;
import com.empbulletin.bootcampersbulletin.repository.MarksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class AdminController {

    @Autowired
    private EmployeeRepository eR;

    @Autowired
    private MarksRepository mR;

    @Autowired
    private InterviewRepository iR;


    // Get all employees
    @GetMapping
    public List<Employee> getAllEmployees() {
        return eR.findAll();
    }

    // Get employee by ID
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return eR.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Employee not found with id: " + id));
    }

    // Add new employee
    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return eR.save(employee);
    }

    // Update existing employee
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails) {
        Employee employee = eR.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Employee not found with id: " + id));

        employee.setEmp_name(employeeDetails.getEmp_name());
        employee.setEmp_mail(employeeDetails.getEmp_mail());
        employee.setBatchNo(employeeDetails.getBatchNo());

        return eR.save(employee);
    }
    //adding marks to employee by Id
    @PostMapping("/{empId}/marks")
    @ResponseStatus(HttpStatus.CREATED)
    public Marks enterMarksForEmployee(@PathVariable Long empId, @RequestBody Marks marks) {
        Optional<Employee> employeeOptional = eR.findById(empId);
        if (employeeOptional.isPresent()) {
            marks.setEmployee(employeeOptional.get()); // Associate marks with the employee
            return mR.save(marks); // Use the instance method save() on marksRepository
        } else {
            // Handle the case where employee with given id doesn't exist
            throw new ResourceNotFoundException("Employee with id " + empId + " not found");
        }
    }
    //adding interviews to employee by Id
    @PostMapping("/{empId}/interview")
    @ResponseStatus(HttpStatus.CREATED)
    public Interview enterInterviewForEmployee(@PathVariable Long empId, @RequestBody Interview interview) {
        Optional<Employee> employeeOptional = eR.findById(empId);
        if (employeeOptional.isPresent()) {
            interview.setEmployee(employeeOptional.get()); // Associate marks with the employee
            return iR.save(interview); // Use the instance method save() on marksRepository
        } else {
            // Handle the case where employee with given id doesn't exist
            throw new ResourceNotFoundException("Employee with id " + empId + " not found");
        }
    }

    // Delete employee
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        eR.deleteById(id);
    }
}
