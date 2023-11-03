package com.mycompany.trabalhomvcswing.model;

import java.util.List;
import java.util.ArrayList;

public class ListaUsuario {
    private static List<Usuario> listaUsuario; // Lista de usuários

    public static List<Usuario> InstaciarLista() { // Método para instanciar a lista de usuários
        if (listaUsuario == null) { // Verifica se a lista de usuários é nula
            listaUsuario = new ArrayList<>(); // Instancia a lista de usuários
        }
        return listaUsuario;
    }
}

