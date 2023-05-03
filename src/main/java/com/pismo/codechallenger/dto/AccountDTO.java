package com.pismo.codechallenger.dto;

import com.pismo.codechallenger.repository.entity.AccountEntity;

import lombok.Data;

@Data
public class AccountDTO {

	private Integer id;
	private String documentNumber;
	
	public AccountEntity convertEntity() {
		return new AccountEntity(id, documentNumber);
	}

}
