package com.Deva.Bank_app.mapper;

import com.Deva.Bank_app.dto.AccountDto;
import com.Deva.Bank_app.model.Account;

public class AccountMapper {
    public static AccountDto AccountToAccountDto(Account a){
        return new AccountDto(a.getId(),a.getAccountHolderName(),a.getBalance());
    }
    public static Account AccountDtoToAccount(AccountDto a){
        return new Account(a.getId(),a.getAccountHolderName(),a.getBalance());
    }
}
