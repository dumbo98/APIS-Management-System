package com.apis.management.model;

import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by scottkim on 1/16/17.
 */
public class Record {
    @Id
    private String id;
    private Person customer;
    private List<Person> depedentList;
    private List<Policy> policyList;

    public Record(Person customer, List<Person> depedentList, List<Policy> policyList) {
        this.customer = customer;
        this.depedentList = depedentList;
        this.policyList = policyList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Person getCustomer() {
        return customer;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }

    public List<Person> getDepedentList() {
        return depedentList;
    }

    public void setDepedentList(List<Person> depedentList) {
        this.depedentList = depedentList;
    }

    public List<Policy> getPolicyList() {
        return policyList;
    }

    public void setPolicyList(List<Policy> policyList) {
        this.policyList = policyList;
    }
}
