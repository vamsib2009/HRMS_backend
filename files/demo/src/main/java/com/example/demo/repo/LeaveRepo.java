package com.example.demo.repo;


import com.example.demo.model.Leaves;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; // Optional, JpaRepository already includes @Repository

@Repository
public interface LeaveRepo extends JpaRepository<Leaves, Integer> {

}

