package com.doas.jaggaer.models;

import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SourcingEventModel {

    //@JsonProperty("Id")
    private Long id;
    
    //@JsonProperty("EventNumber")
    private String eventNumber;
    
    //@JsonProperty("EventType")
    private String eventType;
    
    //@JsonProperty("EventTitle")
    private String eventTitle;
    
    //@JsonProperty("EventStatus")
    private String eventStatus;
    
    //@JsonProperty("WorkGroup")
    private String workGroup;
    
    //@JsonProperty("StageNumber")
    private int stageNumber;
    
    private Timestamp createdDate;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }

    public String getWorkGroup() {
        return workGroup;
    }

    public void setWorkGroup(String workGroup) {
        this.workGroup = workGroup;
    }

    public int getStageNumber() {
        return stageNumber;
    }

    public void setStageNumber(int stageNumber) {
        this.stageNumber = stageNumber;
    }

    public String getEventNumber() {
        return eventNumber;
    }

    public void setEventNumber(String eventNumber) {
        this.eventNumber = eventNumber;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    
    
    
}
