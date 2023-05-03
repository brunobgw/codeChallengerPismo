package com.pismo.codechallenger.repository.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "transactions")
public class TransactionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    private Integer accountId;
    private Integer operationTypeId;
    private Double amount;
    private LocalDateTime eventDate;
    
    @PrePersist
    protected void prePersist() {
        if (this.eventDate == null) {
        	eventDate = LocalDateTime.now();
        }
    }
	
}
