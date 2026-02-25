package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long securityId;

    public Security() {}

    public Security(String name, String category, String purchaseDate, double purchasePrice, int quantity) {
    }

    // Use Alt+Insert to generate Getters and Setters here
}