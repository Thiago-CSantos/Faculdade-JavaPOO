package com.mycompany.aula03_10;

public class Aula03_10 {

    public static void main(String[] args) {

        String frase = null;
        String novaFrase = null;

        try {
            novaFrase = frase.toUpperCase();
        } catch (NullPointerException e) {
            System.err.println("Exceção: " + e);
            System.err.println("A frase inicial está nula. Foi inserido um valor default\n");

            frase = "Frase vazia";
        }

        finally {
            novaFrase = frase.toUpperCase();
        }

        System.out.println("Frase antiga: " + frase);
        System.out.println("Frase frase: " + novaFrase);
    }
}
