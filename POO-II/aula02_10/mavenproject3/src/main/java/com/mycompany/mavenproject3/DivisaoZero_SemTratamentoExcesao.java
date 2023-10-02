
package com.mycompany.mavenproject3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoZero_SemTratamentoExcesao {

    public static int divisao(int numerador, int denominador) throws ArithmeticException{
        return numerador / denominador;
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        boolean op = true;

        do {
            try {
                System.out.println("NUMERADOR");
                int numerador = sc.nextInt();
                System.out.println("DENONIMADOR");
                int denominador = sc.nextInt();
                
                int result = divisao(numerador, denominador);
                System.out.println("RESULTADO" + result); 
                op = false;
            } catch (InputMismatchException e) {
                System.err.println("Exceção: " + e);
                sc.nextLine();
                System.err.println("Você deve digitar inteiros. Por favor, tentar novamente");
            }

            catch(ArithmeticException e){
                System.err.println("Exceção "+ e);
                System.out.println("Zero é um valor invalida para o  denominador");
            }
        } while (op);
    }
    
   
}
