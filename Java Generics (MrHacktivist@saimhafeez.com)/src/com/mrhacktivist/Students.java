package com.mrhacktivist;

import java.io.Serializable;

public class Students implements Serializable {
    private String name;
    private String id;

    public Students() {}

    public Students(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void showData(){
        System.out.println("Student Name: " + getName());
        System.out.println("Student ID: " + getId());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
