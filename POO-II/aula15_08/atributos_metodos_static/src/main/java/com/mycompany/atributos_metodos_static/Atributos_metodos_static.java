package com.mycompany.atributos_metodos_static;

public class Atributos_metodos_static {

    public static void main(String[] args) {

        Funcionario.valeRefeicaoDiario = 15;

        Funcionario f1 = new Funcionario();
        f1.nome = "Thiago";
        f1.salario = 1458.00;
        
        Funcionario.reajustarValeRefeicaoDiario(0.1);
        System.out.println("Funcionario: "+ f1.nome+", "+ f1.salario + ", " + f1.valeRefeicaoDiario);
        
        // ex1
        int vet[] = {1,2,5,6,7,8,9,54,5,9,45,66,12,36,15};
        
        
        Exercicio1.mutipliqueVetor(vet);
        

    }
}
