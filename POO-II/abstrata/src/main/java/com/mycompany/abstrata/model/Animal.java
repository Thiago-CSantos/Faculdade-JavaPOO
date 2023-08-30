package com.mycompany.abstrata.model;

public abstract class Animal {
    private String nome;
    private double peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void dormir(){
        System.out.println("Dormindo....");
    }    

    public abstract void fazerBarulho();
    
}
