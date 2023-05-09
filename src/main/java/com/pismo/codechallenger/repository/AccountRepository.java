package com.pismo.codechallenger.repository;

import org.springframework.data.repository.CrudRepository;

import com.pismo.codechallenger.repository.entity.AccountEntity;

public interface AccountRepository extends CrudRepository<AccountEntity, Integer>{
	
	public AccountEntity findByDocumentNumber(String documentNumber);
	
}
