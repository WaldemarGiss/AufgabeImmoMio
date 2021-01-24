package com.aufgabe.entites;

public class ParameterEntities {
        private String $schema;
        private String type;
        private PropertiesEntities propertiesEntities;

    public ParameterEntities(String $schema, String type, PropertiesEntities propertiesEntities) {
        this.$schema = $schema;
        this.type = type;
        this.propertiesEntities = propertiesEntities;
    }

    @Override
    public String toString() {
        return "ParameterEntities{" +
                "schema='" + $schema + '\'' +
                ", type='" + type + '\'' +
                ", propertiesEntities=" + propertiesEntities +
                '}';
    }

    public String get$Schema() {
        return $schema;
    }

    public void set$Schema(String $schema) {
        this.$schema = $schema;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PropertiesEntities getPropertiesEntities() {
        return propertiesEntities;
    }

    public void setPropertiesEntities(PropertiesEntities propertiesEntities) {
        this.propertiesEntities = propertiesEntities;
    }
}
