package com.mycompany.sistema_folha_pagamento.entitie;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
            double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return (super.toString() + "\n" + "salario base: R$" + getBaseSalary());
    }

}
