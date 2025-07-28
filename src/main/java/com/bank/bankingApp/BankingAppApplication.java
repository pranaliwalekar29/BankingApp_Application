package com.bank.bankingApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.bank.bankingApp.repository")
@EntityScan(basePackages = "com.bank.bankingApp.entity")
@SpringBootApplication
public class BankingAppApplication {

	public static void main(String[] args) {


		SpringApplication.run(BankingAppApplication.class, args);
	}

}
