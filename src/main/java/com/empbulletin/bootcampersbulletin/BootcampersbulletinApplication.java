package com.empbulletin.bootcampersbulletin;

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

	@Override
	public void run(String... args) throws Exception {

		Employee emp = new Employee();
		emp.setEname("Dhyanshekar");		
		emp.setEmail("dhyan_shekar@thbs.com");
		emp.setEmp_id(11541);
		emp.setUnix(25);
		eR.save(emp);
		
		Employee emp1 = new Employee();
		emp1.setEname("Somanadh");		
		emp1.setEmail("somanadh_nineri@thbs.com");
		emp1.setEmp_id(11567);
		emp1.setUnix(30);
		eR.save(emp1);
		
	}
}
