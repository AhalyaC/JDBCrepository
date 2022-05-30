package com.example.demo.entity;


public class InterestRate {

	private int interestId;
	private String rateSpecificationCode;
	private String name;
	private String description;
	private String currency;
	private String validFrom;
	private String validTill;
	public int getInterestId() {
		return interestId;
	}
	public void setInterestId(int interestId) {
		this.interestId = interestId;
	}
	public String getRateSpecificationCode() {
		return rateSpecificationCode;
	}
	public void setRateSpecificationCode(String rateSpecificationCode) {
		this.rateSpecificationCode = rateSpecificationCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getValidFrom() {
		return validFrom;
	}
	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}
	public String getValidTill() {
		return validTill;
	}
	public void setValidTill(String validTill) {
		this.validTill = validTill;
	}
	
	
}
