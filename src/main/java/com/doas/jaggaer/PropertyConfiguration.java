package com.doas.jaggaer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


@Configuration
public class PropertyConfiguration {
    
    @Value("${jaggaer.sourcingevent.url}")
    private String jaggaerSourcingEventURL;

    public String getJaggaerSourcingEventURL() {
        return jaggaerSourcingEventURL;
    }

    public void setJaggaerSourcingEventURL(String jaggaerSourcingEventURL) {
        this.jaggaerSourcingEventURL = jaggaerSourcingEventURL;
    }
   
    
}