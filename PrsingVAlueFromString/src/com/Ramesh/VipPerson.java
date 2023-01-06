package com.Ramesh;

public class VipPerson {
    private String name;

    public VipPerson() {
        this("Default name",50000.00,"default@gmail.com");
    }

    private double creditLimit;
    private String emailAddress;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public VipPerson(String name, double creditLimit) {
        this(name,creditLimit,"unknown@gmai.com");
    }
    public VipPerson(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

}
