package com.sstark.generalmarket.infrastructure.dto;

public class CategoryDto {

    private Integer id;
    private String title;
    private boolean state;

    public CategoryDto(Integer id, String title, boolean state) {
        this.id = id;
        this.title = title;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean getState() {
        return this.state;
    }
}
