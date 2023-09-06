package com.mycompany.sistema_folha_pagamento.entitie;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber; // "CPF" dos EUA

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "Nome: " + getFirstName() + " " + getLastName() + "\nSocial Security Number: "
                + getSocialSecurityNumber();
    }

    public abstract double earnings();

}
