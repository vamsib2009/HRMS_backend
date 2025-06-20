package com.example.demo.model;
import jakarta.persistence.*;

import java.time.LocalDate;

import lombok.AllArgsConstructor; // For @AllArgsConstructor (Optional, but recommended)
import lombok.Data; // For @Data (Optional, but recommended)
import lombok.NoArgsConstructor; // For @NoArgsConstructor (Optional, but recommended)
import jakarta.persistence.Id;
@Entity // Marks this class as a JPA entity, mapping it to a database table [7-10]
@Data // A Lombok annotation that automatically generates getters, setters, toString(), hashCode(), and equals() methods [3, 7]
@NoArgsConstructor // A Lombok annotation that generates a no-argument constructor [7]
@AllArgsConstructor

public class Leaves {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private LeaveType type;

    private LeaveStatus status;

    private LocalDate date;

    private String reason;
    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private Employee employee;



}
