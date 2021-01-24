package com.aufgabe.entites;

public class UpdateEntities {
    private ParameterEntities parameter;

    public UpdateEntities(ParameterEntities parameter) {
        this.parameter = parameter;
    }

    public ParameterEntities getParameter() {
        return parameter;
    }

    public void setParameter(ParameterEntities parameter) {
        this.parameter = parameter;
    }

    @Override
    public String toString() {
        return "UpdateEntities{" +
                "parameter=" + parameter +
                '}';
    }
}
