package com.doas.jaggaer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DocumentExportResponse {

    private String version = "1.0";
    
    @JsonProperty("Header")
    private SourcingEventResponseHeader header;
    
    @JsonProperty("Response")
    private SourcingEventResponse response;

    
    public SourcingEventResponseHeader getHeader() {
        return header;
    }

    public void setHeader(SourcingEventResponseHeader header) {
        this.header = header;
    }

    public SourcingEventResponse getResponse() {
        return response;
    }

    public void setResponse(SourcingEventResponse response) {
        this.response = response;
    }
    
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    
    public static DocumentExportResponse getNewInstance(String messageId, String timeStamp, String relatedMessageId) {

        DocumentExportResponse documentExportResponse = new DocumentExportResponse();
        documentExportResponse.setHeader(SourcingEventResponseHeader.getNewInstance(messageId, timeStamp, relatedMessageId));     
        return documentExportResponse;
    }
    
}
