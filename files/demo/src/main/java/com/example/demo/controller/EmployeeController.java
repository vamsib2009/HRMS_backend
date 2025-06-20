package com.example.demo.controller;

import com.example.demo.model.Employee;

import com.example.demo.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus; // For returning appropriate HTTP status codes
import org.springframework.http.ResponseEntity; // For wrapping response with status code
//import org.springframework.web.bind.annotation.CrossOrigin; // To handle CORS if frontend is on different port
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Marks this class as a REST Controller, returning data directly
@RequestMapping("/employees") // Base path for all endpoints in this controller
//@CrossOrigin(origins = "http://localhost:3000") // Adjust port if your frontend is different
public class EmployeeController {

    @Autowired // Injects the EmployeeService instance
    private EmployeeService employeeService;


    @GetMapping("/loademployees") // Maps GET requests to /employees/load-dummy-data
    public String loadDummyEmployeeData() {
        return employeeService.loadDummyEmployees();

    }

    @GetMapping("/empdata") // Maps GET requests to /employees (to view all employees)
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK); // Return 200 OK status [28, 33]
    }

}
