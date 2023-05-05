package com.ibk.retotecnico.domains.exchangerate.domain.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;


@Data
@Builder(toBuilder = true)
public class ExchangeRateDto {
    private BigDecimal rate;
    private BigDecimal amount;
    private String from;
    private String to;
    private BigDecimal result;
	public BigDecimal getRate() {
		return rate;
	}
	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}
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
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getResult() {
		return result;
	}
	public void setResult(BigDecimal result) {
		this.result = result;
	}
	
	
	public ExchangeRateDto(BigDecimal rate, BigDecimal amount, String from, String to, BigDecimal result) {
		this.rate = rate;
		this.amount = amount;
		this.from = from;
		this.to = to;
		this.result = result;
	}
    
}
