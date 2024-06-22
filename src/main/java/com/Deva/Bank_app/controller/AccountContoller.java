package com.Deva.Bank_app.controller;

import com.Deva.Bank_app.dto.AccountDto;
import com.Deva.Bank_app.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/account")
public class AccountContoller {

    private AccountService service;

    private AccountContoller(AccountService service){
        this.service=service;
    }

    @PostMapping
    public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto adto){
        return new ResponseEntity<>(service.createAccount(adto), HttpStatus.CREATED);
    }
//    @GetMapping("/check")
//    public String check(){
//        return "hello world";
//    }
    @GetMapping("/{id}")
    public ResponseEntity<AccountDto> getAccountById( Long id){
        return new ResponseEntity<>(service.getAccountById(id),HttpStatus.OK);
    }

    @PutMapping("/{id}/deposit")
    public ResponseEntity<AccountDto> depositMoney(@PathVariable Long id, @RequestBody Map<String,Double> variables){
        double amt=variables.get("amount");
        return new ResponseEntity<AccountDto>(service.depositeMoney(id,amt),HttpStatus.OK);
    }

    @PutMapping("/{id}/withdraw")
    public ResponseEntity<AccountDto> withdrawMoney(@PathVariable Long id,@RequestBody Map<String,Double> map){
        double amt=map.get("amount");
        return new ResponseEntity<AccountDto>(service.withdrawMoney(id,amt),HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<AccountDto>> getAllAccounts(){
        return ResponseEntity.ok(service.getAllAccount());
    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<String> deleteAccount(@PathVariable Long id){
        service.deleteAccount(id);
        return ResponseEntity.ok("Account Deleted Successfully ");
    }

}

