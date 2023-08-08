
package com.mycompany.aula07_08;

import com.mycompany.aula07_08.entitie.Aluno;
import java.util.Scanner;


public class Aula07_08 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno a1 = new Aluno();
        
        System.out.println("Digite o RA do aluno");
        a1.ra = sc.nextInt();
        
        System.out.println("Digite o [nota1] do aluno");
        a1.nota1 = sc.nextInt();
        
        System.out.println("Digite o [nota2] do aluno");
        a1.nota2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o nome do aluno");
        a1.nome = sc.nextLine();
        
        a1.calcularMedia();
        System.out.println("Media: "+a1.media);
        
    }
}
