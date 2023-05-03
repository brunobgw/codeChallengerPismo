package com.pismo.codechallenger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pismo.codechallenger.repository.AccountRepository;
import com.pismo.codechallenger.repository.entity.AccountEntity;

@RestController
@RequestMapping("accounts")
public class AccountController {

	private final AccountRepository repository;

	public AccountController(final AccountRepository repository) {
		this.repository = repository;
	}

	@GetMapping
	public Object find() {
		return repository.findAll();
	}

	
	@GetMapping("/savetest")
	public Object save() {
		AccountEntity account = new AccountEntity();
		account.setDocumentNumber("12345678900");
		return repository.save(account);
	}
}
