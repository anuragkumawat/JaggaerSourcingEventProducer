package com.doas.jaggaer.services;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.doas.jaggaer.PropertyConfiguration;

@Service
@Transactional
public class SourcingEventService {

    
    @Autowired
    PropertyConfiguration propertyConfiguration;
    
    public ResponseEntity<String> sendXML(String xmlData) {
        
        RestTemplate restTemplate =  new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_XML);
        HttpEntity<String> request = new HttpEntity<String>(xmlData, headers);
        
        final ResponseEntity<String> response = restTemplate.postForEntity(propertyConfiguration.getJaggaerSourcingEventURL(), request, String.class);
        
        return response;

    }

    
    public ResponseEntity<String> updateXML(String xmlData) {
        
        RestTemplate restTemplate =  new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_XML);
        HttpEntity<String> request = new HttpEntity<String>(xmlData, headers);
        final ResponseEntity<String> response =  restTemplate.exchange(propertyConfiguration.getJaggaerSourcingEventURL(), HttpMethod.PUT, request, String.class);
        
        return response;

    }

}
