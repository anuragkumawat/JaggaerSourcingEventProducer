package com.doas.jaggaer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourcingEventResponseHeader {

    @JsonProperty("MessageId")
    private String messageId;
    
    @JsonProperty("RelatedMessageId")
    private String relatedMessageId;
    
    @JsonProperty("TimeStamp")
    private String timeStamp;

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getRelatedMessageId() {
        return relatedMessageId;
    }

    public void setRelatedMessageId(String relatedMessageId) {
        this.relatedMessageId = relatedMessageId;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
    
    
    public static SourcingEventResponseHeader getNewInstance(String messageId, String timeStamp, String relatedMessageId) {

        SourcingEventResponseHeader sourcingEventResponseHeader = new SourcingEventResponseHeader();
        sourcingEventResponseHeader.setMessageId(messageId);
        sourcingEventResponseHeader.setRelatedMessageId(relatedMessageId);
        sourcingEventResponseHeader.setTimeStamp(timeStamp);        
        return sourcingEventResponseHeader;
    }
    
}
