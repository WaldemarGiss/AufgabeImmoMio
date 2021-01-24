package com.aufgabe.entites;

public class PlansEntities {

    private String id;
    private String name;
    private String description;
    private String metadata;
    private Boolean free;
    private Boolean bindable;
    private ServiceBindingEntities serviceBindingEntities;

    public PlansEntities(String id, String name, String description, String metadata, Boolean free, Boolean bindable, ServiceBindingEntities serviceBindingEntities) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.metadata = metadata;
        this.free = free;
        this.bindable = bindable;
        this.serviceBindingEntities = serviceBindingEntities;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public Boolean getFree() {
        return free;
    }

    public void setFree(Boolean free) {
        this.free = free;
    }

    public Boolean getBindable() {
        return bindable;
    }

    public void setBindable(Boolean bindable) {
        this.bindable = bindable;
    }

    public ServiceBindingEntities getServiceBindingEntities() {
        return serviceBindingEntities;
    }

    public void setServiceBindingEntities(ServiceBindingEntities serviceBindingEntities) {
        this.serviceBindingEntities = serviceBindingEntities;
    }
}
