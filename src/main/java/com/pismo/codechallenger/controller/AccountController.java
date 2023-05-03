package com.pismo.codechallenger.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pismo.codechallenger.dto.AccountDTO;
import com.pismo.codechallenger.repository.entity.AccountEntity;
import com.pismo.codechallenger.service.AccountService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("accounts")
public class AccountController {

	private final AccountService service;
	
	@GetMapping
	public ResponseEntity<Iterable<AccountEntity>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<AccountEntity> find(@PathVariable Integer id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.noContent().build());
	}
	
	@PostMapping
	public ResponseEntity<AccountEntity> save(@RequestBody AccountDTO account) {
		return ResponseEntity.ok(service.save(account));
	}
}
