package com.apis.management.model;

/**
 * Created by scottkim on 1/16/17.
 */
public class Policy {
    private CarrierType carrier;
    private String policyNumber;
    private PolicyType type;

    public Policy(CarrierType carrier, String policyNumber, PolicyType type) {
        this.carrier = carrier;
        this.policyNumber = policyNumber;
        this.type = type;
    }

    public enum CarrierType {
        ERIE, PROGRESSIVE, AIC, GMAC;
    }

    public enum PolicyType {
        AUTO, HOME, COMMERCIAL, LIFE;
    }

    public CarrierType getCarrier() {
        return carrier;
    }

    public void setCarrier(CarrierType carrier) {
        this.carrier = carrier;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public PolicyType getType() {
        return type;
    }

    public void setType(PolicyType type) {
        this.type = type;
    }
}
