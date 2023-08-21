package com.mycompany.aula21_08;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.aula21_08.entity.Animal;
import com.mycompany.aula21_08.entity.Cachorro;
import com.mycompany.aula21_08.entity.Coercao;
import com.mycompany.aula21_08.entity.Soma;

public class Aula21_08 {
    public static void main(String[] args) {
        // Overloading
        Soma s = new Soma();

        int x, y;
        x = 5;
        y = 2;

        System.out.println("Resultado: " + s.somar(x, y));

        double a, b;
        a = 5.9;
        b = 2.98;

        System.out.println("Resultado: " + s.somar(a, b));

        float c, j;
        c = 5.9f;
        j = 2.98f;

        System.out.println("Resultado: " + s.somar(c, j));

        // Coerção
        Coercao ex = new Coercao();
        int n = 2;
        ex.exibir(n);

        double num = 2;
        ex.exibir((float) num);

        // Universal - Paramétrico

        List<Object> aList = new ArrayList<>();

        aList.add("jdsd");
        aList.add(54);
        System.out.println(aList);

        // Inclusão
        
        Animal a1 = new Cachorro();

        a1.fazerBaralho();

    }
}
