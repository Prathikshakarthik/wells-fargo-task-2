package com.wellsfargo.counselor.entity;


import ch.qos.logback.core.net.server.Client;
import jakarta.persistence.*;

@Entity
class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long portfolioId;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public Portfolio() {
    }

    public Portfolio(Client client) {
        this.client = client;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}