package com.example.demo.controller;
import com.example.demo.model.Leaves;


import com.example.demo.service.LeaveService;
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
public class LeaveController {
    @Autowired
    private LeaveService leaveservice;
    @GetMapping("/loadleaves") // Maps GET requests to /employees/load-dummy-data
    public String loadDummyLeaveData() {
        return leaveservice.loadDummyLeaves();

    }
    @GetMapping("/leavedata") // Maps GET requests to /employees (to view all employees)
    public ResponseEntity<List<Leaves>> getAllLeavs() {
        List<Leaves> leaves = leaveservice.getAllLeaves();
        return new ResponseEntity<>(leaves, HttpStatus.OK); // Return 200 OK status [28, 33]
    }
}
