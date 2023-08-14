package com.sstark.generalmarket.domain.models;

public class Category {
    private String description;
    private boolean state;

    public Category(String description, boolean state) {
        this.description = description;
        this.state = state;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
