package com.empbulletin.bootcampersbulletin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empbulletin.bootcampersbulletin.model.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	//all crud database operations
    List<Employee> findByBatchNo(Integer batchNo);
	
}
