package com.empbulletin.bootcampersbulletin.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

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

	@Column(name = "Batch_No", nullable = false)
	private String batch;

	@Column(name = "Password", nullable = false)
	private  String password;

	public void setPassword(String password) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encryptedPassword = passwordEncoder.encode(password);
		this.password = encryptedPassword;
	}

	public boolean isPasswordValid(String password) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		return passwordEncoder.matches(password, this.password);
	}

}