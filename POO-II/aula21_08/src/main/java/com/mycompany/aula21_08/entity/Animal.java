package com.mycompany.aula21_08.entity;

public class Animal {
    private String nome;
    private double peso;

    public Animal() {
    }

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

    public void fazerBaralho(){
        System.out.println("Fazendo baralho....");
    }

}
