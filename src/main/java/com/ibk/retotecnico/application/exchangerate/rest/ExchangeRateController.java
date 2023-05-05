package com.ibk.retotecnico.application.exchangerate.rest;

import com.ibk.retotecnico.application.exchangerate.dto.ExchangeRequest;
import com.ibk.retotecnico.domains.exchangerate.domain.dto.ExchangeRateDto;
import com.ibk.retotecnico.domains.exchangerate.domain.service.ExchageRateService;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/exchange-rage")
@RequiredArgsConstructor
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ExchangeRateController {
	
	@Autowired
    private ExchageRateService exchageRateService;

	@RequestMapping(value = "/calculate", produces = { "application/json" }, consumes = {
	"application/json" }, method = RequestMethod.POST)
    public ExchangeRateDto exchangeRate(@RequestBody ExchangeRequest exchangeRequest) {
        return exchageRateService.exchageRate(exchangeRequest);
    }

}
