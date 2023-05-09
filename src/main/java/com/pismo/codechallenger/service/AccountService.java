package com.pismo.codechallenger.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pismo.codechallenger.dto.AccountDTO;
import com.pismo.codechallenger.repository.AccountRepository;
import com.pismo.codechallenger.repository.entity.AccountEntity;
import com.pismo.codechallenger.repository.entity.TransactionEntity;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@Service
public class AccountService {
	
	private final AccountRepository repository;
	
	private static final double BALANCE_INIT = 500d;

	public AccountEntity save(AccountDTO dto) {
		AccountEntity entity = dto.convertEntity();
		entity.setBalance(BALANCE_INIT);
		repository.save(entity);
		log.info("Account persisted");
		return entity;
	}
	
	public void adjustBalance(TransactionEntity transactionEntity) throws Exception {
		Optional<AccountEntity> accountEntity = repository.findById(transactionEntity.getAccountId());
		if(accountEntity.isPresent()) {
			AccountEntity account = accountEntity.get();
			Double balanceFinal = account.getBalance();
			if( (transactionEntity.getOperationTypeId() != 4) /*COMPRA*/ && transactionEntity.getAmount() > account.getBalance()) {
				throw new Exception("No autorizado");
			} else if(transactionEntity.getOperationTypeId() != 4 && transactionEntity.getAmount() <= account.getBalance()) { //COMPRA
				balanceFinal -= transactionEntity.getAmount();
			} else if(transactionEntity.getOperationTypeId() == 4) { //PAGAMENTO
				balanceFinal += transactionEntity.getAmount();
			}
			account.setBalance(balanceFinal);
			repository.save(account);
		} else {
			throw new Exception("Account not found!");
		}
	}
	
	
	public Optional<AccountEntity> findById(Integer id) {
		return repository.findById(id);
	}

	public Iterable<AccountEntity> findAll() {
		return repository.findAll();
	}
	
}
