package com.mycompany.abstrata.model;

public class Cachorro extends Animal{

    @Override
    public void fazerBarulho() {
        System.out.println("Au, au");
    }

    public void enterrarOsso(){
        System.out.println("enterrando 'bone'");
    }
    
}
