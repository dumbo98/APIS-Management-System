package com.apis.management.model;

import java.util.Date;
import java.util.List;

/**
 * Created by scottkim on 1/16/17.
 */
public class Policy {
    private CarrierType carrier;
    private String number;
    private PolicyType type;
    private PolicyStatus status;
    private Date effectiveDate;
    private Person policyHolder;
    private List<Person> drivers;
    private List<Vehicle> vehicles;

    public Policy(CarrierType carrier, String number, PolicyType type, PolicyStatus status, Date effectiveDate,
                  Person policyHolder, List<Person> drivers, List<Vehicle> vehicles) {
        this.carrier = carrier;
        this.number = number;
        this.type = type;
        this.status = status;
        this.effectiveDate = effectiveDate;
        this.policyHolder = policyHolder;
        this.drivers = drivers;
        this.vehicles = vehicles;
    }

    public CarrierType getCarrier() {
        return carrier;
    }

    public void setCarrier(CarrierType carrier) {
        this.carrier = carrier;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public PolicyType getType() {
        return type;
    }

    public void setType(PolicyType type) {
        this.type = type;
    }

    public PolicyStatus getStatus() {
        return status;
    }

    public void setStatus(PolicyStatus status) {
        this.status = status;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Person getPolicyHolder() {
        return policyHolder;
    }

    public void setPolicyHolder(Person policyHolder) {
        this.policyHolder = policyHolder;
    }

    public List<Person> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Person> drivers) {
        this.drivers = drivers;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public enum CarrierType {
        ERIE, PROGRESSIVE, AIC, GMAC, OTHER;
    }

    public enum PolicyType {
        HOME, AUTO, COMMERCIAL, LIFE;
    }

    public enum PolicyStatus {
        ACTIVE, PENDING, CANCELLED;
    }
}
