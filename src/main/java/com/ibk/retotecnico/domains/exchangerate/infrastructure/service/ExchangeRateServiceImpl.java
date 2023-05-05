package com.ibk.retotecnico.domains.exchangerate.infrastructure.service;

import com.ibk.retotecnico.application.exchangerate.dto.ExchangeRequest;
import com.ibk.retotecnico.connector.model.ExchangeRate;
import com.ibk.retotecnico.connector.service.ApiExchangeRateService;
import com.ibk.retotecnico.domains.exchangerate.domain.dto.ExchangeRateDto;
import com.ibk.retotecnico.domains.exchangerate.domain.service.ExchageRateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExchangeRateServiceImpl implements ExchageRateService {
	
	@Autowired
    private ApiExchangeRateService apiExchangeRateService;

    @Override
    public ExchangeRateDto exchageRate(ExchangeRequest exchangeRequest) {
    	System.out.println("Inicio ExchangeRequest: ");
    	System.out.println("getTo0: "+exchangeRequest.getTo());
    	System.out.println("getFrom0: "+exchangeRequest.getFrom());
    	System.out.println("getAmount0: "+exchangeRequest.getAmount());
    	
        ExchangeRate exchangeRate = apiExchangeRateService.getExchange(exchangeRequest);
    	System.out.println("Fin ExchangeRequest: ");
        return new ExchangeRateDto(exchangeRate.getInfo().getRate(),
        		exchangeRate.getQuery().getAmount(),
        		exchangeRate.getQuery().getFrom(),
        		exchangeRate.getQuery().getTo(),
        		exchangeRate.getResult());
    }
}
