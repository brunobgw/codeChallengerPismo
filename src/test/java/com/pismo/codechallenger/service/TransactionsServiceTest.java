package com.pismo.codechallenger.service;

import static org.mockito.Mockito.when;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.pismo.codechallenger.dto.TransactionsDTO;
import com.pismo.codechallenger.repository.TransactionsRepository;
import com.pismo.codechallenger.repository.entity.TransactionEntity;

@ExtendWith(MockitoExtension.class)
class TransactionsServiceTest {

	@InjectMocks
	private TransactionsService service;
	@Mock
	private TransactionsRepository repository;
	
	@Test
	void test() {
		TransactionsDTO dto = new TransactionsDTO( null, 1, 1, 2.33d, null);
		TransactionEntity entity = dto.convertEntity();
		when(repository.save(entity)).thenReturn(entity);
		System.out.println(service.save(dto));
	}

}
