package com.aufgabe.repository;

import com.aufgabe.entites.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;


@Repository
public class AufgabeRepository implements AufgabeRepositoryInterface {

    @Autowired
    private AufgabeRepositoryInterface aufgabeRepositoryInterface;

    List<ServicesEntities> serviceListe;
    List<PlansEntities> plansEntities;

    public AufgabeRepository(){
        serviceListe = new ArrayList<>();
        plansEntities = new ArrayList<>();

        BillingAccountEntities billingAccountEntities = new BillingAccountEntities("", "");
        PropertiesEntities propertiesEntities = new PropertiesEntities(billingAccountEntities);
        ParameterEntities parameterEntities = new ParameterEntities("", "", propertiesEntities);
        CreateEntities createEntities = new CreateEntities(parameterEntities);
        ServiceBindingEntities serviceBindingEntities = new ServiceBindingEntities(createEntities);
        SchemasEntities schemasEntities = new SchemasEntities(serviceBindingEntities);



        plansEntities.add(new PlansEntities("d3031751-XXXX-XXXX-XXXX-a42377d3320e", "fake-plan-1", "Shared fake Server, 5tb persistent disk, 40 max concurrent connections", "max_storage_tb", false, true, serviceBindingEntities));
      //  PlansEntities plansEntity2 = new PlansEntities("d3031751-XXXX-XXXX-XXXX-a42377d3320e", "fake-plan-1", "Shared fake Server, 5tb persistent disk, 40 max concurrent connections", "max_storage_tb", false, true);
        //
        serviceListe.add(new ServicesEntities("Service1", "1", "dieser Service holt dir ein leckeres Erdbeer-Eis", true, true, plansEntities));
        serviceListe.add(new ServicesEntities("Service2", "2", "dieser Service holt dir ein leckeres Erdbeer-Eis", true, true, plansEntities));
    }


    @Override
    public List<ServicesEntities> getCatalog() {
        return serviceListe;
    }


    @Override
    public ServicesEntities createServiceInstance(ServicesEntities servicesEntities) {
        serviceListe.add(servicesEntities);
        return servicesEntities;
    }

    @Override
    public void deleteServiceInstance(long serviceInstanceID) {
        this.serviceListe.removeIf(servicesEntities -> Long.parseLong(servicesEntities.getId()) == serviceInstanceID);
    }


    @Override
    public ServicesEntities createBinding(ServiceBindingEntities serviceBindingEntities, long bindingID, long serviceInstanceID) {
        ServicesEntities servicesEnty = null;

        for (ServicesEntities services : serviceListe) {
            if (Long.parseLong(services.getId()) == serviceInstanceID) {
                servicesEnty = services;
                servicesEnty.getPlans().get(0).setServiceBindingEntities(serviceBindingEntities);
                break;
            }
        }
        return servicesEnty;
    }
    // @Override
    // public void deleteBinding(String bindingID) {
    //     return null;
    // }
}
