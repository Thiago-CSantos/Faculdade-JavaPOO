package com.mycompany.aula03_10;

public class Exercicio {
    public static void main(String[] args) {
        System.out.println("Inicio");
        try {
            metodo1();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("deu uma exception" + e);
        }
        System.out.println("Fim");
    }

    public static void metodo1() {
        System.out.println("Inicio do metodo1");
        metodo2();
        System.out.println("Fim do metodo");
    }

    public static void metodo2() throws ArrayIndexOutOfBoundsException {
        System.out.println("Inicio do metodo 2");
        int array[] = new int[10];

        try {
            for (int i = 0; i <= 15; i++) {
                array[i] = i;
                System.out.println(i);
            }
        } catch (Exception e) {
            System.out.println("Erro no metodo 2" + e);
        }
        System.out.println("Fim do metodo 2");
    }
}
