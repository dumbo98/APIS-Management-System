package com.apis.management.model;

import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

/**
 * Created by scottkim on 1/16/17.
 */
public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private Date dateOfBirth;
    private MaritalStatus maritalStatus;
    private String driverLicenseState;
    private String driverLicenseNumber;
    private List<Address> address;
    private List<Phone> phone;

    public Person(String firstName, String middleName, String lastName, Date dateOfBirth, MaritalStatus maritalStatus, String driverLicenseState, String driverLicenseNumber, List<Address> address, List<Phone> phone) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.maritalStatus = maritalStatus;
        this.driverLicenseState = driverLicenseState;
        this.driverLicenseNumber = driverLicenseNumber;
        this.address = address;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getDriverLicenseState() {
        return driverLicenseState;
    }

    public void setDriverLicenseState(String driverLicenseState) {
        this.driverLicenseState = driverLicenseState;
    }

    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }

    public void setDriverLicenseNumber(String driverLicenseNumber) {
        this.driverLicenseNumber = driverLicenseNumber;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public List<Phone> getPhone() {
        return phone;
    }

    public void setPhone(List<Phone> phone) {
        this.phone = phone;
    }

    public enum PersonType {
        PRIMARY, DEPENDENT;
    }

    public enum MaritalStatus {
        SINGLE, MARRIED, DIVORCED, WIDOWED;
    }
}
