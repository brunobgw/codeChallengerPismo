package com.pismo.codechallenger.dto;

import com.pismo.codechallenger.repository.entity.AccountEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AccountDTO {

	private Integer id;
	private String documentNumber;
	private Double balance;
	
	public AccountEntity convertEntity() {
		return new AccountEntity(id, documentNumber, balance);
	}

}
