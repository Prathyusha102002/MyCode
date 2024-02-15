package com.empbulletin.bootcampersbulletin.controller;


import com.empbulletin.bootcampersbulletin.model.EmployeeMarks;
import com.empbulletin.bootcampersbulletin.repository.EmployeeMarksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v2/employee-marks")

public class EmployeeMarksController {

    @Autowired
    private EmployeeMarksRepository emr;

    @GetMapping
    public List<EmployeeMarks> getAllMarks() {
        return emr.findAll();
    }

}