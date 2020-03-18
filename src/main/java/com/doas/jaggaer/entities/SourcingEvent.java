package com.doas.jaggaer.entities;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.doas.jaggaer.models.SourcingEventModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

//@Table(name = "source_event")
@Entity
@ApiModel(description = "All details about the sourcing event")
public class SourcingEvent {

    @ApiModelProperty(notes = "The database generated sourcing event ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ApiModelProperty(notes = "sourcing event number")
    @Column(name = "event_number")
    private String eventNumber;
    
    @ApiModelProperty(notes = "sourcing event type")
    @Column(name = "event_type")
    private String eventType;
    
    @ApiModelProperty(notes = "sourcing event title")
    @Column(name = "event_title")
    private String eventTitle;
    
    @ApiModelProperty(notes = "sourcing event status")
    @Column(name = "event_status")
    private String eventStatus;
    
    @ApiModelProperty(notes = "work group")
    @Column(name = "work_group")
    private String workGroup;
    
    @ApiModelProperty(notes = "stage number")
    @Column(name = "stage_number")
    private int stageNumber;
    
    @ApiModelProperty(notes = "created date")
    @Column(name = "created_date")
    private Timestamp CreatedDate;


    public String getEventNumber() {
        return eventNumber;
    }

    public void setEventNumber(String eventNumber) {
        this.eventNumber = eventNumber;
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

    public Timestamp getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        CreatedDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
    public static SourcingEvent getNewInstance(SourcingEventModel sourcingEventModel) {
        SourcingEvent sourcingEvent = new SourcingEvent();
        sourcingEvent.setEventNumber(sourcingEventModel.getEventNumber());
        sourcingEvent.setEventTitle(sourcingEventModel.getEventTitle());
        sourcingEvent.setEventStatus(sourcingEventModel.getEventStatus());
        sourcingEvent.setEventType(sourcingEventModel.getEventType());
        sourcingEvent.setStageNumber(sourcingEventModel.getStageNumber());
        sourcingEvent.setWorkGroup(sourcingEventModel.getWorkGroup());
        sourcingEvent.setCreatedDate(new Timestamp(System.currentTimeMillis()));
        return sourcingEvent;
    }
    
    public static SourcingEvent copyInstance(SourcingEventModel sourcingEventModel, SourcingEvent existingSourcingEvent) {
        SourcingEvent sourcingEvent = new SourcingEvent();
        sourcingEvent.setId(sourcingEventModel.getId());
        sourcingEvent.setEventNumber(sourcingEventModel.getEventNumber());
        sourcingEvent.setEventTitle(sourcingEventModel.getEventTitle());
        sourcingEvent.setEventStatus(sourcingEventModel.getEventStatus());
        sourcingEvent.setEventType(sourcingEventModel.getEventType());
        sourcingEvent.setStageNumber(sourcingEventModel.getStageNumber());
        sourcingEvent.setWorkGroup(sourcingEventModel.getWorkGroup());
        sourcingEvent.setCreatedDate(existingSourcingEvent.getCreatedDate());
        return sourcingEvent;
    }
    
    
}
