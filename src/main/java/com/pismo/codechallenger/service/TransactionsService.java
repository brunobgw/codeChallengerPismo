package com.pismo.codechallenger.service;

import org.springframework.stereotype.Service;

import com.pismo.codechallenger.dto.TransactionsDTO;
import com.pismo.codechallenger.repository.TransactionsRepository;
import com.pismo.codechallenger.repository.entity.TransactionEntity;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@Service
public class TransactionsService {

	private final TransactionsRepository repository;

	public TransactionEntity save(TransactionsDTO transaction) {
		TransactionEntity entity = transaction.convertEntity();
		repository.save(entity);
		log.info("Persisted Entity");
		return entity;
	}
	
}