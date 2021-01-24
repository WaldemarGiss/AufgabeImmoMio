package com.aufgabe.entites;

public class ServiceBindingEntities {

    private CreateEntities create;

    public ServiceBindingEntities(CreateEntities create) {
        this.create = create;
    }

    @Override
    public String toString() {
        return "ServiceBindingEntitites{" +
                "create=" + create +
                '}';
    }

    public CreateEntities getCreate() {
        return create;
    }

    public void setCreate(CreateEntities create) {
        this.create = create;
    }
}
