package com.bank.bankingApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor  // Ensures the DTO can be used in serialization
public class AccountDto {
    private Long id;
    private String accountHolderName;
    private double balance;
}
