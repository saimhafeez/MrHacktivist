package com.mrhacktivist;

import java.io.Serializable;

public class Employees implements Serializable {

    private String name;
    private String id;
    private int workhours;

    public Employees() {}

    public Employees(String name, String id, int workhours) {
        this.name = name;
        this.id = id;
        this.workhours = workhours;
    }

    public void showData(){
        System.out.println("Employee Name: " + getName());
        System.out.println("Employee ID: " + getId());
        System.out.println("Employee ID: " + getWorkhours());
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

    public int getWorkhours() {
        return workhours;
    }

    public void setWorkhours(int workhours) {
        this.workhours = workhours;
    }
}