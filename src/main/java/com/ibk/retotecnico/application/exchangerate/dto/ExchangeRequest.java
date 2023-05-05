package com.ibk.retotecnico.application.exchangerate.dto;

import lombok.Data;
import lombok.NonNull;

import java.math.BigDecimal;

@Data
public class ExchangeRequest {
    @NonNull
    public String to;
    @NonNull
    public String from;
    @NonNull
    public BigDecimal amount;
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public ExchangeRequest() {
		super();
	}
	
}
