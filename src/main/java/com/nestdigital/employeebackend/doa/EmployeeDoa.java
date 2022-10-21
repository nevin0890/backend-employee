package com.nestdigital.employeebackend.doa;

import com.nestdigital.employeebackend.EmployeeModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDoa extends CrudRepository<EmployeeModel, Integer> {

    @Modifying
    @Query(value = "DELETE FROM `employees` WHERE `id` =:id", nativeQuery = true)
    void deleteById(int id);

    @Query(value = "SELECT `id`, `address`, `company`, `dob`, `email`, `name`, `salary` FROM `employees` WHERE `name` =:name", nativeQuery = true)
    EmployeeModel SearchbyName(String name);

}
