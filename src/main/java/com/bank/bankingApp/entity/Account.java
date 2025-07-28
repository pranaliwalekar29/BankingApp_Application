package com.bank.bankingApp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  // Generates getters, setters, toString, equals, and hashCode
@AllArgsConstructor  // Generates a constructor with all fields
@NoArgsConstructor  // Generates a no-arg constructor
@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID
    private Long id;
    @Column(name="Account_holder_name")
    private String accountHolderName;
    private double balance;
}
