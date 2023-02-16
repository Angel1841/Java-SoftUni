package com.likebookapp.model.entity;

public enum MoodsEnum {

    HAPPY ("Happy"),

    SAD ("Sad"),

    INSPIRED ("Inspired");

    private final String value;

    private MoodsEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
