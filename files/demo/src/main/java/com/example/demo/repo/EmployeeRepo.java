package com.example.demo.repo;
import com.example.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; // Optional, JpaRepository already includes @Repository

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
