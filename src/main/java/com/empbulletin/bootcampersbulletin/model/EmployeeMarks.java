package com.empbulletin.bootcampersbulletin.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Employee_Marks")

public class EmployeeMarks {

    @Id
    private long emp_id; // Foreign key and primary key

    @MapsId
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "emp_id")
    private Employee employee;

    @Column(name = "Unix")
    private float unix;

    @Column(name = "SQL_Database")
    private float sqldb;

    @Column(name = "Java")
    private float java;

    @Column(name = "Testing")
    private float st;

    @Column(name = "Python")
    private float python;

    @Column(name = "AIML")
    private float aiml;

    @Column(name = "Azure")
    private float azure;

    @Column(name = "GIT")
    private float git;

    @Column(name = "Jenkins")
    private float jenkins;

    @Column(name = "Devops")
    private float devops;

}
