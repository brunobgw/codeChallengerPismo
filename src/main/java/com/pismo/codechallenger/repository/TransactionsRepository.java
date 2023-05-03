package com.pismo.codechallenger.repository;

import org.springframework.data.repository.CrudRepository;

import com.pismo.codechallenger.repository.entity.TransactionEntity;

public interface TransactionsRepository extends CrudRepository<TransactionEntity, Integer>{

}
