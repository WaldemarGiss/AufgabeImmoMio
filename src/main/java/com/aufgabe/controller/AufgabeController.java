package com.aufgabe.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.aufgabe.entites.ServiceBindingEntities;
import com.aufgabe.entites.ServicesEntities;
import com.aufgabe.service.AufgabeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AufgabeController {

    @Autowired
    private AufgabeServiceInterface aufgabeServiceInterface;

    //Gibt eine Liste aller Services aus.
    @RequestMapping(path = "/v2/catalog", method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<ServicesEntities> getCatalog() {
     //   ArrayList<ServicesEntities> catalog = new ArrayList<>();
       return this.aufgabeServiceInterface.getCatalog();
    }

    //Add Service
    @RequestMapping(path = "/v2/addService", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ServicesEntities createServiceInstance(@RequestBody ServicesEntities servicesEntities) {
        return this.aufgabeServiceInterface.createServiceInstance(servicesEntities);
    }

    //Delete Service
    @RequestMapping(path= "/v2/deleteService/{serviceInstanceID}", method = RequestMethod.DELETE)
    public ResponseEntity<HttpStatus> deleteServiceInstance(@PathVariable String serviceInstanceID){
       try{
           this.aufgabeServiceInterface.deleteServiceInstance(Long.parseLong(serviceInstanceID));
           return new ResponseEntity<>(HttpStatus.OK);
       }catch (Exception e){
           return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
       }
    }

    //Create Binding
    @RequestMapping(path = "/v2/createBinding/{bindingID}/service/{serviceInstanceID}", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<HttpStatus> createBinding(@RequestBody ServiceBindingEntities serviceBindingEntities, @PathVariable String bindingID, @PathVariable String serviceInstanceID){
        try{
            this.aufgabeServiceInterface.createBinding(serviceBindingEntities, Long.parseLong(bindingID), Long.parseLong(serviceInstanceID));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            String message = "fehler";
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    //Delete Binding
    // @RequestMapping(value = "secured",path = "/v2/deleteBinding", method = RequestMethod.DELETE)
    // public void deleteBinding(@PathVariable String bindingID){
    //     return this.aufgabeServiceInterface.deleteBinding(bindingID);
    // }








}
