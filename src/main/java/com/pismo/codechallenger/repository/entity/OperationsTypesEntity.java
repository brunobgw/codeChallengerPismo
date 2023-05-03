package com.pismo.codechallenger.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "operation_types")
public class OperationsTypesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    @Column(name = "description")
	private String documentNumber;
}
