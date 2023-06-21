package com.softtek.ja.map.bank;

public class BankCustomer {
	private String name;
	private double currentBalance;
	private String transactionDate;
	private String transactionType;
	private double transactionAmount;
	
	public BankCustomer(String name, double currentBalance, String transactionDate, String transactionType,
			double transactionAmount) {
		this.name = name;
		this.currentBalance = currentBalance;
		this.transactionDate = transactionDate;
		this.transactionType = transactionType;
		this.transactionAmount = transactionAmount;
	}

	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getCurrentBalance() {
		return currentBalance;
	}



	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}



	public String getTransactionDate() {
		return transactionDate;
	}



	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}



	public String getTransactionType() {
		return transactionType;
	}



	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}



	public double getTransactionAmount() {
		return transactionAmount;
	}



	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}



	@Override
	public String toString() {
		return "BankCustomer [name=" + name + ", currentBalance=" + currentBalance + ", transactionDate=" + transactionDate
				+ ", transactionType=" + transactionType + ", transactionAmount=" + transactionAmount + "]";
	}
	
	
}	
	