package com.ac3.core;

import com.ac3.utils.IVAUtility;

public class Invoice {
	private int number;
	private String concept;
	private double amount;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getConcept() {
		return concept;
	}
	public void setConcept(String concept) {
		this.concept = concept;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getAmount() {
		return IVAUtility.calculateIVA(amount);
	}
	
	
}
