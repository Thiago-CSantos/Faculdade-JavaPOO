/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula07_08.entitie;

/**
 *
 * @author android
 */
public class Aluno {
    
    public int ra;
    public double nota1;
    public double nota2;
    public double media;
    public String nome;

    public Aluno(int ra, double nota1, double nota2, double media, String nome) {
        this.ra = ra;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = media;
        this.nome = nome;
    }

    public Aluno(){
    }
    
    
    
    
    
    public void calcularMedia(){
        media = (this.nota1+this.nota2)/2;
    }
    
}
