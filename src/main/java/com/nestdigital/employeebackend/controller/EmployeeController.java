package com.nestdigital.employeebackend.controller;

import com.nestdigital.employeebackend.EmployeeModel;
import com.nestdigital.employeebackend.doa.EmployeeDoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDoa Doa;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/employeeadd", consumes = "application/json", produces = "application/json")
    public String employeeadd(@RequestBody EmployeeModel employee) {
        System.out.println(employee.toString());
        Doa.save(employee);
        return  "{\"status\":\"success\"}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/employeeview")
    public List<EmployeeModel> employeeview() {
        return (List<EmployeeModel>) Doa.findAll();
    }

    @Transactional
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/employeeedelete", consumes = "application/json", produces = "application/json")
    public String employeeedelete(@RequestBody EmployeeModel employee) {
        System.out.println(employee.toString());
        Doa.deleteById(employee.getId());
        return  "{\"status\":\"success\"}";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/employeesearch", consumes = "application/json", produces = "application/json")
    public List<EmployeeModel> employeesearch(@RequestBody EmployeeModel employee) {
        return (List<EmployeeModel>) Doa.SearchbyName(employee.getName());
    }


}
