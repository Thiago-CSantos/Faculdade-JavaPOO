package com.mycompany.abstrata.model;

public class Galinha extends Animal{

    @Override
    public void fazerBarulho() {
        System.out.println("Có, có");
    }

    public void botar(){
        System.out.println("bota eggs");
    }
    
}
