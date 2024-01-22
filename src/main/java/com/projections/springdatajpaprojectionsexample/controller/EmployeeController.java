package com.projections.springdatajpaprojectionsexample.controller;

import com.projections.springdatajpaprojectionsexample.projection.EmployeeDetails;
import com.projections.springdatajpaprojectionsexample.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;
    @Autowired
    private EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees/list")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok("Total Employees: "+ employeeService.findAll().size());
    }

    @GetMapping("/employees/{email}")
    public ResponseEntity<?> findByEmail(@PathVariable String email) {
        EmployeeDetails employeeDetails = employeeService.findByEmail(email);
        return employeeDetails == null ?
                ResponseEntity.ok("EmployeeDetails not found") :
                ResponseEntity.ok(employeeDetails);
    }



}
