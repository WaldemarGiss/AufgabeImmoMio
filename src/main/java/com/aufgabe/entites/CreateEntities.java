package com.aufgabe.entites;

public class CreateEntities {
    private ParameterEntities parameter;

    public CreateEntities(ParameterEntities parameter) {
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
        return "CreateEntities{" +
                "parameter=" + parameter +
                '}';
    }
}
