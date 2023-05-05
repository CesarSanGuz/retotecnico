package com.ibk.retotecnico.connector.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ExchangeRate {
    private String date;
    private Info info;
    private Query query;
    private BigDecimal result;
    private boolean sucess;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Info getInfo() {
		return info;
	}
	public void setInfo(Info info) {
		this.info = info;
	}
	public Query getQuery() {
		return query;
	}
	public void setQuery(Query query) {
		this.query = query;
	}
	public BigDecimal getResult() {
		return result;
	}
	public void setResult(BigDecimal result) {
		this.result = result;
	}
	public boolean isSucess() {
		return sucess;
	}
	public void setSucess(boolean sucess) {
		this.sucess = sucess;
	}
	public ExchangeRate() {
		super();
	}
}
