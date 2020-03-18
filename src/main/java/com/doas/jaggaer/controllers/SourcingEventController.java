package com.doas.jaggaer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.doas.jaggaer.services.SourcingEventService;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags = "Sourcing Event API")
public class SourcingEventController {
    
    @Autowired
    SourcingEventService sourcingEventService;
   
    
    @ApiOperation(value = "Create new sourcing event")
    @PostMapping(path = "/sourcing-event", consumes=MediaType.TEXT_XML_VALUE, produces = MediaType.TEXT_XML_VALUE )
    public ResponseEntity<String> createSourcingEvent(@RequestBody String xmlData) throws JsonProcessingException {
        
         return sourcingEventService.sendXML(xmlData);

    }
    
//    @ApiOperation(value = "Update existing sourcing event")
//    @PutMapping(path = "/sourcing-event", consumes=MediaType.TEXT_XML_VALUE, produces = MediaType.TEXT_XML_VALUE )
//    public ResponseEntity<String> updateSourcingEvent(@RequestBody String xmlData) throws JsonProcessingException {
//         
//         return sourcingEventService.updateXML(xmlData);
//           
//    }
    
}
