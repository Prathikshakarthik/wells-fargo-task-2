package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Advisor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long advisorId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    // Constructor
    public Advisor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Empty Constructor (Required by JPA)
    public Advisor() {}

    // Getters and Setters
    public Long getAdvisorId() { return advisorId; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
}