
package com.mycompany.aula08_08;

import java.util.ArrayList;


public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<String> listaPessoa = new ArrayList<>();
        
        listaPessoa.add("Rogério");
        
        listaPessoa.add("Paulo");
        listaPessoa.add("João");
        
        
        for(int i = 0; i< listaPessoa.size(); i++){
            String aux = listaPessoa.get(i);
            System.out.println(aux);
        }
        
        // Pega o indice/posição do elemento
        int posicao =listaPessoa.indexOf("João");
        // Altera o elemento pela posição
        listaPessoa.set(posicao, "Tião Carreiro");
        // Remove o elemento da lista
        listaPessoa.remove("Paulo");
        listaPessoa.remove(1);
        
    }
}
