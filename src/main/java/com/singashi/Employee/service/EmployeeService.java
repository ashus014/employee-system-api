package com.singashi.Employee.service;

import com.singashi.Employee.entity.EmployeeEntity;
import com.singashi.Employee.model.Employee;

import java.util.List;

public interface EmployeeService {
    EmployeeEntity createEmployee(Employee employee);

    List<EmployeeEntity> getAllEmployees();
}