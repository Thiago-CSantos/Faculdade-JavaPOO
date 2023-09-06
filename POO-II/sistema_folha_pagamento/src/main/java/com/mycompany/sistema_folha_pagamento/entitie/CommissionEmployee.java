package com.mycompany.sistema_folha_pagamento.entitie;

public class CommissionEmployee extends Employee {

    private double grossSales; // valor das vendas brutas semanais
    private double commissionRate; // porcentagem da comissão

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
            double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return ("---Relatorio---\n" + super.toString() + "\n" + "quantidade de horas trabalhadas: " + getGrossSales()
                + "\n"
                + "Valor da hora trabalhada R$: " + getCommissionRate());
    }

}
