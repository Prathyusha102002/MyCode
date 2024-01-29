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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long emp_id;
	
	@Column(name = "Employee_Name", nullable = false)
	private String ename;
	
	@Column(name = "Email_ID", nullable = false)
	private String email;

}
