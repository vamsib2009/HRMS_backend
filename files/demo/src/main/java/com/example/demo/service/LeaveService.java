package com.example.demo.service;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.example.demo.model.Employee;
import com.example.demo.model.LeaveStatus;
import com.example.demo.model.LeaveType;
import com.example.demo.model.Leaves;

import com.example.demo.repo.LeaveRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LeaveService {
    @Autowired
    private LeaveRepo leavesrepository;

    public  String loadDummyLeaves() {
        // Creating dummy employees with only ID set (assuming they already exist in DB)
        Employee emp1 = new Employee();
        emp1.setId(7223);

        Employee emp2 = new Employee();
        emp2.setId(7224);

        List<Leaves> dummyLeaves = Arrays.asList(
                new Leaves(null, LeaveType.SL, LeaveStatus.APPROVED, LocalDate.of(2024, 6, 1), "Sick leave", emp1),
                new Leaves(null, LeaveType.CL, LeaveStatus.PENDING, LocalDate.of(2024, 6, 10), "Personal work", emp1),
                new Leaves(null, LeaveType.EL, LeaveStatus.APPROVED, LocalDate.of(2024, 5, 15), "Emergency", emp1),
                new Leaves(null, LeaveType.SL, LeaveStatus.REJECTED, LocalDate.of(2024, 6, 12), "Not valid reason", emp2),
                new Leaves(null, LeaveType.CL, LeaveStatus.APPROVED, LocalDate.of(2024, 6, 5), "Function", emp2),
                new Leaves(null, LeaveType.SL, LeaveStatus.APPROVED, LocalDate.of(2024, 6, 8), "Fever", emp2)
        );
        leavesrepository.saveAll(dummyLeaves);

        return "Success";
    }
    public List<Leaves> getAllLeaves() {
        return leavesrepository.findAll();
    }
}
