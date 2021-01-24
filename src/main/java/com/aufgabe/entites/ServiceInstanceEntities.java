package com.aufgabe.entites;

public class ServiceInstanceEntities {

    private CreateEntities create;
    private UpdateEntities update;

    public ServiceInstanceEntities(CreateEntities create, UpdateEntities update) {
        this.create = create;
        this.update = update;
    }

    @Override
    public String toString() {
        return "ServiceInstanceEntities{" +
                "create=" + create +
                ", update=" + update +
                '}';
    }

    public CreateEntities getCreate() {
        return create;
    }

    public void setCreate(CreateEntities create) {
        this.create = create;
    }

    public UpdateEntities getUpdate() {
        return update;
    }

    public void setUpdate(UpdateEntities update) {
        this.update = update;
    }
}
