package com.Deva.Bank_app.dto;

import lombok.Data;

@Data
public class AccountDto {
    private Long id;
    private String AccountHolderName;
    private double balance;
}
