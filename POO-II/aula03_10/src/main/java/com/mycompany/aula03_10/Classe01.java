package com.mycompany.aula03_10;

public class Classe01 {
    private int valor;

    public Classe01(int n) {
        valor = n;
    }

    public void f (int x) throws Exception, ArithmeticException{
        if(x<0){
            throw new Exception("Erro - Argumento negativo: "+ x);
        }
        System.out.println(x/(valor-100));
    }
}
