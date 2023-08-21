package com.mycompany.aula21_08.entity;

public class Galinha extends Animal {

    public void botar() {
        System.out.println("Botar ovo...");
    }

    @Override
    public void fazerBaralho() {
        System.out.println("Có, có");
    }

}
