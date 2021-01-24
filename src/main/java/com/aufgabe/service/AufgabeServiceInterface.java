package com.aufgabe.service;

import com.aufgabe.entites.ServiceBindingEntities;
import com.aufgabe.entites.ServicesEntities;

import java.util.List;

public interface AufgabeServiceInterface {
    List<ServicesEntities> getCatalog();
    ServicesEntities createServiceInstance(ServicesEntities servicesEntities);
    void deleteServiceInstance(long serviceInstanceID);
    ServicesEntities createBinding(ServiceBindingEntities serviceBindingEntities, long bindingID, long serviceInstanceID);
    // void deleteBinding(String bindingID);
}
