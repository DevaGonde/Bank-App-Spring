package com.Deva.Bank_app.service;

import com.Deva.Bank_app.dto.AccountDto;

import java.util.List;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountById(Long id);
    AccountDto depositeMoney(Long id,double amt);
    AccountDto withdrawMoney(Long id,double amt);

    List<AccountDto> getAllAccount();

    boolean deleteAccount(Long id);
}
