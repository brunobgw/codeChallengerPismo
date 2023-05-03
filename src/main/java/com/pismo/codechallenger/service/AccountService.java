package com.pismo.codechallenger.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.pismo.codechallenger.dto.AccountDTO;
import com.pismo.codechallenger.repository.AccountRepository;
import com.pismo.codechallenger.repository.entity.AccountEntity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class AccountService {
	
	private final AccountRepository repository;

	public AccountEntity save(AccountDTO account) {
		AccountEntity entity = account.convertEntity();
		return repository.save(entity);
	}
	
	public Optional<AccountEntity> findById(Integer id) {
		return repository.findById(id);
	}

	public Iterable<AccountEntity> findAll() {
		return repository.findAll();
	}
	
}
