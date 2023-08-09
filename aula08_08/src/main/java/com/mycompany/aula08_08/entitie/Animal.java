package com.mycompany.aula08_08.entitie;

public class Animal {
    
    private String nome;
    private Double peso;

    public Animal(){
    }
    
    public Animal(String nome, Double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    public void dormir(){
        System.out.println ("fazendo barulho...");
    }
    
    public void fazerBarulho(){
        System.out.println( "fazendo barulho...");
    }
}
