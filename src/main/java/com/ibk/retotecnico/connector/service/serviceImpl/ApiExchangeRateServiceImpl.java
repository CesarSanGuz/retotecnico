package com.ibk.retotecnico.connector.service.serviceImpl;

import com.ibk.retotecnico.application.exchangerate.dto.ExchangeRequest;
import com.ibk.retotecnico.connector.model.ExchangeRate;
import com.ibk.retotecnico.connector.service.ApiExchangeRateService;
import lombok.extern.log4j.Log4j2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Log4j2
@Service
public class ApiExchangeRateServiceImpl implements ApiExchangeRateService {

    @Value("${api.exchangerate.apikey}")
    private String apikey;

    @Value("${api.exchangerate.uri}")
    private String uri;

    private RestTemplate restTemplate = new RestTemplate();
    private static final Logger log = LoggerFactory.getLogger(ApiExchangeRateServiceImpl.class);

    @Override
    public ExchangeRate getExchange(ExchangeRequest exchangeRequest) {
    	System.out.println("getTo1: "+exchangeRequest.getTo());
    	System.out.println("getFrom1: "+exchangeRequest.getFrom());
    	System.out.println("getAmount1: "+exchangeRequest.getAmount());
    	System.out.println("uri: "+uri);
    	System.out.println("apikey: "+apikey);
    	log.info("inicio getExchange");
    	try {
    		ResponseEntity<ExchangeRate> response = null;
    		String urlString = uri + "/exchangerates_data/convert?to=" + exchangeRequest.getTo() + "&from=" + exchangeRequest.getFrom() + "&amount=" + exchangeRequest.getAmount();
            HttpHeaders headers = new HttpHeaders();
            headers.set("apikey", apikey);
            //HttpEntity<String> entity = new HttpEntity<>("body", headers);
            HttpEntity<String> entity = new HttpEntity<>(headers);
        	System.out.println("uri.toString(): "+urlString);
            response = restTemplate.exchange(urlString, HttpMethod.GET, entity, new ParameterizedTypeReference<ExchangeRate>() {} );
            log.info(response.getBody().toString());
        	log.info("fin getExchange");
            return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
        	log.info("fin getExchange");
            return null;
		}
    }
}
