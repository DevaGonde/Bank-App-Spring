package com.Deva.Bank_app.service.implementation;

import com.Deva.Bank_app.dto.AccountDto;
import com.Deva.Bank_app.mapper.AccountMapper;
import com.Deva.Bank_app.model.Account;
import com.Deva.Bank_app.repository.AccountRepo;
import com.Deva.Bank_app.service.AccountService;
import org.apache.catalina.mapper.Mapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @Override
    public AccountDto getAccountById(Long id) {
        return AccountMapper.AccountToAccountDto(repo.findById(id).orElseThrow(()->new RuntimeException("Account Not Available")));
    }

    @Override
    public AccountDto depositeMoney(Long id,double amt) {
        Account a=repo.findById(id).orElseThrow(()->new RuntimeException(" Unknown Exception Found"));
        a.setBalance(a.getBalance()+amt);
        return AccountMapper.AccountToAccountDto(a);
    }

    @Override
    public AccountDto withdrawMoney(Long id,double amt) {
        Account a=repo.findById(id).orElseThrow(()->new RuntimeException(" Unknown Exception Found"));
        double balance=a.getBalance()-amt;
        if(balance>0)a.setBalance(balance);else return null;
        return AccountMapper.AccountToAccountDto(a);
    }

    @Override
    public List<AccountDto> getAllAccount() {
        List<Account> accountList =repo.findAll();
        List<AccountDto> list=new ArrayList<>();
        for(Account a:accountList){
            list.add(AccountMapper.AccountToAccountDto(a));
        }
        return list;
    }

    @Override
    public boolean deleteAccount(Long id) {
        repo.deleteById(id);
        return true;
    }
}
