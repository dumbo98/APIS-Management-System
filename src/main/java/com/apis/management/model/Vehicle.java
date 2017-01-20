package com.apis.management.model;

/**
 * Created by scottkim on 1/19/17.
 */
public class Vehicle {
    private String year;
    private String maker;
    private String model;
    private String type;
    private String vin;

    public Vehicle(String year, String maker, String model, String type, String vin) {
        this.year = year;
        this.maker = maker;
        this.model = model;
        this.type = type;
        this.vin = vin;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
}