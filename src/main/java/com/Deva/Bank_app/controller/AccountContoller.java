package com.Deva.Bank_app.controller;

import com.Deva.Bank_app.dto.AccountDto;
import com.Deva.Bank_app.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountContoller {

    private AccountService service;

    private AccountContoller(AccountService service){
        this.service=service;
    }

    @PostMapping()
    public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto adto){
        return new ResponseEntity(service.createAccount(adto), HttpStatus.CREATED);
    }
    @GetMapping("/check")
    public String check(){
        return "hello world";
    }
}
