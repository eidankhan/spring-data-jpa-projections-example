package com.projections.springdatajpaprojectionsexample.service;

import com.projections.springdatajpaprojectionsexample.entity.Employee;
import com.projections.springdatajpaprojectionsexample.projection.EmployeeDetails;
import com.projections.springdatajpaprojectionsexample.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public EmployeeDetails findByEmail(String email){
        return employeeRepository.findByEmail(email);
    }

    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }
}
