package com.bank.bankingApp.controller;

import com.bank.bankingApp.dto.AccountDto;
import com.bank.bankingApp.entity.Account;
import com.bank.bankingApp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    private AccountService accountService;
    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }



    //add account RestAPI
    @PostMapping
    public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto) {
        return new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);
    }



    //getAccount rest Api
    @GetMapping("/{id}")
    public ResponseEntity<AccountDto> getAccountById(@PathVariable Long id){
        AccountDto accountDto=accountService.getAccountById(id);
        return ResponseEntity.ok(accountDto);
    }



    //deposite RestApi
    @PutMapping("/{id}/deposit")
    public ResponseEntity<AccountDto> deposit(@PathVariable Long id,@RequestBody Map<String,Double>request){
        Double amount=request.get("amount");
        AccountDto accountDto=accountService.deposit(id,amount);
        return  ResponseEntity.ok(accountDto);
    }


    //withdraw rest api
    @PutMapping("/{id}/withdraw")
    public ResponseEntity<AccountDto> withdraw(@PathVariable Long id,@RequestBody Map<String ,Double> request){
        double amount=request.get("amount");
        AccountDto accountDto=accountService.withdraw(id,amount);
        return ResponseEntity.ok(accountDto);
    }



    //get all account RestApi
    @GetMapping
    public  ResponseEntity<List<AccountDto>> getAllAccounts(){
        List<AccountDto> accounts=accountService.getAllAccounts();
        return  ResponseEntity.ok(accounts);
    }



    //deleteAccountRestApi
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAccount(@PathVariable Long id){
        accountService.deleteAccount(id);
        return ResponseEntity.ok("Account is deleted successfully!!");
    }
}