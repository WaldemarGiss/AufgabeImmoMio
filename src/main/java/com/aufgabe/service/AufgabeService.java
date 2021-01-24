package com.aufgabe.service;

import com.aufgabe.entites.ServiceBindingEntities;
import com.aufgabe.entites.ServicesEntities;
import com.aufgabe.repository.AufgabeRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AufgabeService implements AufgabeServiceInterface {

    @Autowired
    private AufgabeRepositoryInterface aufgabeRepositoryInterface;

    @Override
    public List<ServicesEntities> getCatalog() {
        return this.aufgabeRepositoryInterface.getCatalog();
    }

    @Override
    public ServicesEntities createServiceInstance(ServicesEntities servicesEntities) {
        return this.aufgabeRepositoryInterface.createServiceInstance(servicesEntities);
    }

    @Override
    public void deleteServiceInstance(long serviceInstanceID) {
        this.aufgabeRepositoryInterface.deleteServiceInstance(serviceInstanceID);
    }

    @Override
    public ServicesEntities createBinding(ServiceBindingEntities serviceBindingEntities, long bindingID, long serviceInstanceID){
        return this.aufgabeRepositoryInterface.createBinding(serviceBindingEntities, bindingID, serviceInstanceID);
    }


    // @Override
    // public void deleteBinding(String bindingID){
    //     return this.aufgabeRepositoryInterface.deleteBinding(bindingID);
    // }


}
