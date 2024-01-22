package com.projections.springdatajpaprojectionsexample.repository;

import com.projections.springdatajpaprojectionsexample.entity.Employee;
import com.projections.springdatajpaprojectionsexample.projection.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    EmployeeDetails findByEmail(String email);

}
