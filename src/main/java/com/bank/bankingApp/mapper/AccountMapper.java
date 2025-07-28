package com.bank.bankingApp.mapper;

import com.bank.bankingApp.dto.AccountDto;
import com.bank.bankingApp.entity.Account;

public class AccountMapper {
    public static Account MapToAccount(AccountDto accountDto) {
        Account account=new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );
        return account;
    }

    public static AccountDto MapToAccountDto(Account account) {
        AccountDto accountDto=new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        return accountDto;
    }
}
