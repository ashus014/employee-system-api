package com.singashi.Employee.controller;

import com.singashi.Employee.entity.EmployeeEntity;
import com.singashi.Employee.model.Employee;
import com.singashi.Employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/get/employees")
    public List<Employee> getEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping("/employees")
    public EmployeeEntity createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }
}
