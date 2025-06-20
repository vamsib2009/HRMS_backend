package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue; // For @GeneratedValue
import jakarta.persistence.GenerationType; // For GenerationType
import jakarta.persistence.Id; // For @Id
import lombok.AllArgsConstructor; // For @AllArgsConstructor (Optional, but recommended)
import lombok.Data; // For @Data (Optional, but recommended)
import lombok.NoArgsConstructor; // For @NoArgsConstructor (Optional, but recommended)



    @Entity // Marks this class as a JPA entity, mapping it to a database table [7-10]
    @Data // A Lombok annotation that automatically generates getters, setters, toString(), hashCode(), and equals() methods [3, 7]
    @NoArgsConstructor // A Lombok annotation that generates a no-argument constructor [7]
    @AllArgsConstructor // A Lombok annotation that generates a constructor with all fields [7]
    public class Employee {

        @Id // Designates 'id' as the primary key of the table [8-11]

        private int id;

        // Common fields for an Employee
        private String name;
        private String designation;

        private String email;
        private String mobile;

}
