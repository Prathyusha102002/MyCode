package com.empbulletin.bootcampersbulletin;

import com.empbulletin.bootcampersbulletin.model.EmployeeMarks;
import com.empbulletin.bootcampersbulletin.repository.EmployeeMarksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.empbulletin.bootcampersbulletin.model.Employee;
import com.empbulletin.bootcampersbulletin.repository.EmployeeRepository;

@SpringBootApplication
public class BootcampersbulletinApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BootcampersbulletinApplication.class, args);
	}

	@Autowired
	private EmployeeRepository eR;
	private EmployeeMarksRepository emr;

	@Override
	public void run(String... args) throws Exception {

		Employee emp = new Employee();
		emp.setEname("Dhyanshekar");
		emp.setEmail("dhyan_shekar@thbs.com");
		emp.setEmp_id(11541);
		emp.setBatch("BC102");
		emp.setPassword("dannydhyan");
		eR.save(emp);

		Employee emp1 = new Employee();
		emp1.setEname("Virat Kohli");
		emp1.setEmail("virat_kohli@thbs.com");
		emp1.setEmp_id(10000);
		emp1.setBatch("BC103");
		emp1.setPassword("virat100");
		eR.save(emp1);
	}
}