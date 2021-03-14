package ru.telda.entity;

import java.io.Serializable;

public class Region implements Serializable {
    private Integer id;
    private String title;
    private String abb;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return abb;
    }

    public void setUsername(String abb) {
        this.abb = abb;
    }

    public String getTitle() {
        return title;
    }

    public void setAge(String title) {
        this.title =title;
    }



    @Override
    public String toString() {
        return "Regions{" +
                "id=" + id +
                ", region='" + title + '\'' +
                ", abbreviation='" + abb +
                '}';
    }


}
