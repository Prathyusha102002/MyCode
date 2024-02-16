package com.empbulletin.bootcampersbulletin.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "Employee")
public class Employee {

	@Id
	@Column(name="emp_id")
	private Long emp_id; // Assuming this is the ID for Employee

	@Column(name = "emp_name")
	private String emp_name;
	
	@Column(name = "emp_mail")
	private String emp_mail;

	@Column(name="password")
	private String password;

	@Column(name="batchNo")
	private Integer batchNo;

	public Employee(Long emp_id, String emp_name, String emp_mail, String password, Integer batchNo) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_mail = emp_mail;
		this.password = password;
		this.batchNo = batchNo;
	}

	public Employee() {
	}


//	@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
//	private Interview interview;
//
//	// Other methods and annotations
//
//	public Interview getInterview() {
//		return interview;
//	}
//
//	public void setInterview(Interview interview) {
//		this.interview = interview;
//	}
//
//	@OneToOne(mappedBy="employee", cascade= CascadeType.ALL)
//	private Marks marks;
//	public Marks getMarks()
//	{
//		return marks;
//
//	}
//	public void setMarks(Marks marks)
//	{
//		this.marks=marks;
//	}

	public void setEmp_id(Long emp_id) {
		this.emp_id = emp_id;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public void setEmp_mail(String emp_mail) {
		this.emp_mail = emp_mail;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setBatchNo(Integer batchNo) {
		this.batchNo = batchNo;
	}

	public Long getEmp_id() {
		return emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public String getEmp_mail() {
		return emp_mail;
	}

	public String getPassword() {
		return password;
	}

	public Integer getBatchNo() {
		return batchNo;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"emp_id=" + emp_id +
				", emp_name='" + emp_name + '\'' +
				", emp_mail='" + emp_mail + '\'' +
				", password='" + password + '\'' +
				", batchNo=" + batchNo +
				'}';
	}
}
