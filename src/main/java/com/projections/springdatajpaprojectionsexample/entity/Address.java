package com.projections.springdatajpaprojectionsexample.entity;


import jakarta.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "street", length = 50, nullable = false)
    private String street;

    @Column(name = "city", length = 50, nullable = false)
    private String city;

    @Column(name = "state", length = 50, nullable = false)
    private String state;

    @Column(name = "zip_code", length = 10, nullable = false)
    private String zipCode;

    @OneToOne(mappedBy = "address")
    private Employee employee;

    // Constructors, getters, setters, equals, hashcode, and toString methods


    public Address(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Employee getPerson() {
        return employee;
    }

    public void setPerson(Employee employee) {
        this.employee = employee;
    }
}
