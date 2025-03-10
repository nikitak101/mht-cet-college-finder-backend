package com.example.java.project.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "sggs") // This should match your table name in MySQL
public class College {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(name = "cutoff_percentage", nullable = false)
    private double cutoffPercentage;

    // Constructors
    public College() {}

    public College(String name, double cutoffPercentage) {
        this.name = name;
        this.cutoffPercentage = cutoffPercentage;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCutoffPercentage() {
        return cutoffPercentage;
    }

    public void setCutoffPercentage(double cutoffPercentage) {
        this.cutoffPercentage = cutoffPercentage;
    }
}
