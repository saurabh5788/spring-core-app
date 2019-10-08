package com.beans.account;

public class CreditCard implements Account {
	private Integer id;
	private Integer customerId;
	private String cardType; //Visa or Master
	private Integer limit;
	
	public CreditCard(Integer id, Integer customerId, String cardType, Integer limit){
		this.id = id;
		this.customerId = customerId;
		this.cardType = cardType;
		this.limit = limit;
	}
	
	private Integer dueAmount;
	
	public Integer getDueAmount() {
		return dueAmount;
	}


	public void setDueAmount(Integer dueAmount) {
		this.dueAmount = dueAmount;
	}


	@Override
	public String toString() {
		return "CreditCard [id=" + id + ", dueAmount=" + dueAmount
				+ ", customerId=" + customerId + ", cardType=" + cardType + "]";
	}
	
	
}
