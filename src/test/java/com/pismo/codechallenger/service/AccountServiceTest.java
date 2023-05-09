package com.pismo.codechallenger.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.pismo.codechallenger.dto.AccountDTO;
import com.pismo.codechallenger.repository.AccountRepository;
import com.pismo.codechallenger.repository.entity.AccountEntity;

@ExtendWith(MockitoExtension.class)
class AccountServiceTest {

	@InjectMocks
	private AccountService accountService;
	@Mock
	private AccountRepository repository;
	
	@Test
	void test() {
		AccountDTO dto = new AccountDTO( null, "897123871", null);
		AccountEntity entity = dto.convertEntity();
		accountService.save(dto);
		//when(repository.save(entity)).thenReturn(entity);
		//System.out.println(entity);
		//todo: check limit 500
	}

}
