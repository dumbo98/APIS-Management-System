package com.apis.management.model;

import org.springframework.data.annotation.Id;

/**
 * Created by scottkim on 1/16/17.
 */
public class Person {
    private Name name;
    private Address address;
    private Phone phone;

    public Person(Name name, Address address, Phone phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
