package com.concepts.spring.spring_data_jpa_multitenancy.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@Transactional
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping(path = "/employee")
    public ResponseEntity<?> createEmployee() {
        Employee newEmployee = new Employee();
        System.out.println("newEmployee: " + newEmployee.toString());
        newEmployee.setName("Baeldung");
        System.out.println("newEmployee name: " + newEmployee.getName());
        employeeRepository.save(newEmployee);
        System.out.println("employeeRepository.save ");
        return ResponseEntity.ok(newEmployee);
    }

    @GetMapping("/employee")
    public ResponseEntity<?> getEmployees() {
        // List<Employee> employees = employeeRepository.findAll(); 
        // System.out.println("Employees: " + employees);
        return ResponseEntity.ok(employeeRepository.findAll());
    }
    
}
