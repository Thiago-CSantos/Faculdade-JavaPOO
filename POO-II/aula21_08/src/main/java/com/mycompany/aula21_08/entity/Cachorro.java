package com.mycompany.aula21_08.entity;

public class Cachorro extends Animal {

    public void enterrarOsso() {
        System.out.println("Enterrar o osso...");
    }

    @Override
    public void fazerBaralho() {
        System.out.println("Au, au");
    }

}
