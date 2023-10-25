package com.mycompany.projetoagendamvc.model;

import java.util.ArrayList;
import java.util.List;

public class ListaContato {
    private static List<Pessoa> lista;
    
    private ListaContato(){};
    
    public static List<Pessoa> getInstance(){
        if(lista == null){
            lista = new ArrayList<>();
        }
        return lista;
    }
}
