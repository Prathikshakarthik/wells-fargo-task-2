package com.wellsfargo.counselor.entity;

import ch.qos.logback.core.net.server.Client;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import javax.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long portfolioId;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public Portfolio() {}

    public Portfolio(Client client) {
        this.client = client;
    }

    // Use Alt+Insert to generate Getters and Setters here
}
