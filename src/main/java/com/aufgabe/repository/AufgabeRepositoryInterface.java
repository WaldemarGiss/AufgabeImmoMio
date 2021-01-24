package com.aufgabe.repository;

import com.aufgabe.entites.ServiceBindingEntities;
import com.aufgabe.entites.ServicesEntities;

import java.util.List;

public interface AufgabeRepositoryInterface {
    List<ServicesEntities> getCatalog();
    ServicesEntities createServiceInstance(ServicesEntities servicesEntities);
    void deleteServiceInstance(long serviceInstanceID);
    ServicesEntities createBinding(ServiceBindingEntities serviceBindingEntities, long bindingID, long serviceInstanceID);
    // void deleteBinding(String bindingID);
}
