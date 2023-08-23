package com.mycompany.controleponto;

public class Teste {

    public static void main(String[] args) {

        Funcionario f1 = new Gerente();
        f1.setCodigo(1);
        
        ControlePonto controle = new ControlePonto();
        
        controle.registrarEntrada(f1);
        controle.registrarSaida(f1);
        
        Funcionario f2 = new Telefonista();
        f2.setCodigo(2);
        
        controle.registrarEntrada(f2);
        controle.registrarSaida(f2);

    }
}
