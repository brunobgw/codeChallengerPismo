CREATE TABLE transactions (
	id INT PRIMARY KEY AUTO_INCREMENT,
	account_id int NOT NULL,
	operation_type_id int NOT NULL,
	amount double NOT NULL,
	event_date datetime NOT NULL,
    FOREIGN KEY (account_id) REFERENCES account(id),
    FOREIGN KEY (operation_type_id) REFERENCES operation_types(id)
);