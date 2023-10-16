package com.mycompany.aula16_10;

import javax.swing.JOptionPane;

public class Aula16_10 {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Qual o seu nome?");
        
        System.out.println(nome);
        
        int op =JOptionPane.showConfirmDialog(null, "Seu nome é: "+ nome+"?", "Titulo", 1, 2);
        System.out.println(op);

        if(op == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Dado cadastrado com sucesso", "Alerta", 1);
        }
        else if(op == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Nome não cadastrado");
        }
        else{
            JOptionPane.showMessageDialog(null, "Ação necessaria");
        }
    }
}
