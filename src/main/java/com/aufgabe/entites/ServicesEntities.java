package com.aufgabe.entites;

import java.util.ArrayList;
import java.util.List;

public class ServicesEntities {

    private String name;
    private String id;
    private String description;
    //private ArrayList<String> tags;
   //private ArrayList<String> requires;
    private Boolean bindable;
    //   private DashboardClientEntities dashboard_client;
    private Boolean planUpdateable;
    private List<PlansEntities> plans;

    public ServicesEntities(String name, String id, String description, Boolean bindable, Boolean planUpdateable, List<PlansEntities> plans) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.bindable = bindable;
        this.planUpdateable = planUpdateable;
        this.plans = plans;
    }

    @Override
    public String toString() {
        return "ServicesEntities{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", bindable=" + bindable +
                ", planUpdateable=" + planUpdateable +
                ", plans=" + plans +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getBindable() {
        return bindable;
    }

    public void setBindable(Boolean bindable) {
        this.bindable = bindable;
    }

    public Boolean getPlanUpdateable() {
        return planUpdateable;
    }

    public void setPlanUpdateable(Boolean planUpdateable) {
        this.planUpdateable = planUpdateable;
    }

    public List<PlansEntities> getPlans() {
        return plans;
    }

    public void setPlans(List<PlansEntities> plans) {
        this.plans = plans;
    }
}