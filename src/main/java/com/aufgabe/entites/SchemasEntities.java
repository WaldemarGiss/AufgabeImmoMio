package com.aufgabe.entites;

public class SchemasEntities {

    private ServiceBindingEntities serviceBindingEntities;

    public SchemasEntities(ServiceBindingEntities serviceBindingEntities) {
        this.serviceBindingEntities = serviceBindingEntities;
    }

    @Override
    public String toString() {
        return "$SchemasEntities{" +
                "serviceBindingEntities=" + serviceBindingEntities +
                '}';
    }

    public ServiceBindingEntities getServiceBindingEntities() {
        return serviceBindingEntities;
    }

    public void setServiceBindingEntities(ServiceBindingEntities serviceBindingEntities) {
        this.serviceBindingEntities = serviceBindingEntities;
    }
}
