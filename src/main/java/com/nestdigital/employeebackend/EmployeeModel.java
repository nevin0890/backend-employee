package com.nestdigital.employeebackend;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "employees")

public class EmployeeModel {
    @Id
    @GeneratedValue

    private  int  id;
    private  String  name;
    private  String  email;
    private  String  address;
    private  String  dob;
    private  String  company;
    private  int salary;

    public EmployeeModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public EmployeeModel(int id, String name, String email, String address, String dob, String company, int salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.dob = dob;
        this.company = company;
        this.salary = salary;
    }
}
