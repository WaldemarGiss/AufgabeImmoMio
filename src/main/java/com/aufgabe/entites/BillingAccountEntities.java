package com.aufgabe.entites;

public class BillingAccountEntities {
    private String description;
    private String type;


    public BillingAccountEntities(String description, String type) {
        this.description = description;
        this.type = type;
    }

    @Override
    public String toString() {
        return "BillingAccountEntitites{" +
                "description='" + description + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
