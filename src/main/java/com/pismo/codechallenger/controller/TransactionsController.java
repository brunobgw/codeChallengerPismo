package com.pismo.codechallenger.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pismo.codechallenger.dto.TransactionsDTO;
import com.pismo.codechallenger.repository.entity.TransactionEntity;
import com.pismo.codechallenger.service.TransactionsService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("transactions")
public class TransactionsController {

	private final TransactionsService service;
	
	@PostMapping
	public ResponseEntity<TransactionEntity> save(@RequestBody TransactionsDTO account) {
		return ResponseEntity.ok(service.save(account));
	}
}
