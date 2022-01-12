package com.springboot.bankapp.dto;

import org.springframework.stereotype.Component;

@Component
public class Transfer {
	private String toAccountNumber;
	private double amount;

	public String getToAccountNumber() {
		return toAccountNumber;
	}

	public void setToAccountNumber(String toAccountNumber) {
		this.toAccountNumber = toAccountNumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
