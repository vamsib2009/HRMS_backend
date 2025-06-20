package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepository;

    public String loadDummyEmployees() {

        List<Employee> dummyEmployees = Arrays.asList(
                new Employee(7224,  "Rotta Krishna", "Software Engineer", "krishna.rotta@nebulogic.com", "9676104140"),
                new Employee(7223, "Vamsi Krishna", "software Developer", "vamsi.bolisetti@nebulogic.com", "8247365712"));




        employeeRepository.saveAll(dummyEmployees);

        return "Success";
    }


    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}