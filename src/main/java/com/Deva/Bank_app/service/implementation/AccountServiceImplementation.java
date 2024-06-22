package com.Deva.Bank_app.service.implementation;

import com.Deva.Bank_app.dto.AccountDto;
import com.Deva.Bank_app.mapper.AccountMapper;
import com.Deva.Bank_app.model.Account;
import com.Deva.Bank_app.repository.AccountRepo;
import com.Deva.Bank_app.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImplementation implements AccountService {

    private AccountRepo repo;

    private AccountServiceImplementation(AccountRepo repo){
        this.repo=repo;
    }
    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account= AccountMapper.AccountDtoToAccount(accountDto);
        Account savedAccount=repo.save(account);
        return AccountMapper.AccountToAccountDto(savedAccount);
    }
}
