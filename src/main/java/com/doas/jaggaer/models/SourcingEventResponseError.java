package com.doas.jaggaer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourcingEventResponseError {

    @JsonProperty("ErrorMessage")
    private String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    
    public static SourcingEventResponseError getNewInstance(String errorMessage) {

        SourcingEventResponseError sourcingEventResponseError = new SourcingEventResponseError();
        sourcingEventResponseError.setErrorMessage(errorMessage);
        return sourcingEventResponseError;
    }
  
    
}
