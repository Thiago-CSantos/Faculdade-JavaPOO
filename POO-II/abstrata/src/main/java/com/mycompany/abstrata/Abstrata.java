package com.mycompany.abstrata;

import com.mycompany.abstrata.model.Cachorro;
import com.mycompany.abstrata.model.Galinha;

public class Abstrata {

    public static void main(String[] args) {
        Cachorro dog = new Cachorro();

        dog.setNome("Totó");
        dog.setPeso(20);

        System.out.println("o cachorro "+ dog.getNome()+" pesa: "+dog.getPeso());
        dog.fazerBarulho();
        dog.enterrarOsso();

        Galinha chicken = new Galinha();

        chicken.setNome("Carijó");
        chicken.setPeso(3);

        System.out.println("\nA galinha "+ chicken.getNome()+" pesa: "+chicken.getPeso());

        chicken.fazerBarulho();
        chicken.botar();

    }
}
