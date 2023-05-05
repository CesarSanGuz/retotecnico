package com.ibk.retotecnico.connector.service;

import com.ibk.retotecnico.application.exchangerate.dto.ExchangeRequest;
import com.ibk.retotecnico.connector.model.ExchangeRate;

public interface ApiExchangeRateService {
    public ExchangeRate getExchange(ExchangeRequest exchangeRequest);
}
