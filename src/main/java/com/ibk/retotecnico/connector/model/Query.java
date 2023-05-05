package com.ibk.retotecnico.connector.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Query {
    private BigDecimal amount;
    private String from;
    private String to;
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTu(String to) {
		this.to = to;
	}
	public Query() {
		super();
	}
}
