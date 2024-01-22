package com.projections.springdatajpaprojectionsexample.projection;

import org.springframework.beans.factory.annotation.Value;

public interface EmployeeDetails {
    String getName();
    String getEmail();
    @Value("#{target.address.city}")
    String getCity();
    @Value("#{target.address.state}")
    String getState();
}

