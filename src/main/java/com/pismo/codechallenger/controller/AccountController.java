package com.pismo.codechallenger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pismo.codechallenger.repository.AccountRepository;

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

}
