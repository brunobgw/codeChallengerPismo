package com.pismo.codechallenger.dto;

import java.time.LocalDateTime;

import com.pismo.codechallenger.repository.entity.TransactionEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TransactionsDTO {
	
	private Integer id;
    private Integer accountId;
    private Integer operationTypeId;
    private Double amount;
    private LocalDateTime eventDate;
    
	public TransactionEntity convertEntity() {
		return new TransactionEntity(id, accountId, operationTypeId, amount, eventDate);
	}

}
