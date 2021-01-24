package com.aufgabe.entites;

public class PropertiesEntities {

    private BillingAccountEntities billingAccountEntities;

    public PropertiesEntities(BillingAccountEntities billingAccountEntities) {
        this.billingAccountEntities = billingAccountEntities;
    }

    @Override
    public String toString() {
        return "PropertiesEntities{" +
                "billingAccountEntities=" + billingAccountEntities +
                '}';
    }



    public BillingAccountEntities getBillingAccountEntities() {
        return billingAccountEntities;
    }

    public void setBillingAccountEntities(BillingAccountEntities billingAccountEntities) {
        this.billingAccountEntities = billingAccountEntities;
    }


}
