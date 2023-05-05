package com.ibk.retotecnico.domains.exchangerate.domain.service;

import org.springframework.stereotype.Service;

import com.ibk.retotecnico.application.exchangerate.dto.ExchangeRequest;
import com.ibk.retotecnico.domains.exchangerate.domain.dto.ExchangeRateDto;

@Service
public interface ExchageRateService {
    ExchangeRateDto exchageRate(ExchangeRequest exchangeRequest);
}
