package com.ibk.retotecnico.connector.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Info {
    private BigDecimal rate;
    private String timestamp;
	public BigDecimal getRate() {
		return rate;
	}
	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
}
