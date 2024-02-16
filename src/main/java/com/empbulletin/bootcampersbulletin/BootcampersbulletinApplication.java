package com.empbulletin.bootcampersbulletin;

import com.empbulletin.bootcampersbulletin.model.Interview;
import com.empbulletin.bootcampersbulletin.model.Marks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.empbulletin.bootcampersbulletin.model.Employee;
import com.empbulletin.bootcampersbulletin.repository.EmployeeRepository;

@SpringBootApplication
public class BootcampersbulletinApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootcampersbulletinApplication.class, args);
    }
    
    }
