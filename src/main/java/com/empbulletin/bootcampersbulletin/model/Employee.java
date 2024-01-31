package com.empbulletin.bootcampersbulletin.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Employee")

public class Employee {
	
	@Id
	private long emp_id;
	
	@Column(name = "Employee_Name", nullable = false)
	private String Ename;
	
	@Column(name = "Email_ID", nullable = false)
	private String Email;
	
	@Column(name = "Unix")
	private int unix;
	
	@Column(name = "Java")
	private int java;
	
	@Column(name = "Software_Testing")
	private int testing;
	
}
