package com.mycompany.trabalhomvcswing.controller;

import com.mycompany.trabalhomvcswing.model.ListaUsuario;
import com.mycompany.trabalhomvcswing.model.Usuario;
import java.util.List;

public class UsuarioController {
    public boolean cadastrar(int id, String email, String senha) {
        Usuario usuario = new Usuario(id, email, senha); // Cria um novo usuário
        List<Usuario> listaUsuario = ListaUsuario.InstaciarLista(); // Instancia a lista de usuários
        return listaUsuario.add(usuario); // Adiciona o usuário na lista
    }

    public List<Usuario> getLista() {
        List<Usuario> listaUsuario = ListaUsuario.InstaciarLista(); // Instancia a lista de usuários   
        return listaUsuario; // Retorna a lista de usuários
    }

    public boolean listaIgual(String email, String senha) {
        List<Usuario> listaUsuario = ListaUsuario.InstaciarLista();
        
        for (Usuario usuario : listaUsuario) {
            if (usuario != null && usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                return true; // O usuário com o email e senha fornecidos foi encontrado na lista
            }
        }
        return false;
    }
    
    public boolean alterarSenha(String senhaAntiga, String novaSenha) {
        List<Usuario> listaUsuario = ListaUsuario.InstaciarLista();
        
        for (Usuario usuario : listaUsuario) { // Percorre a lista de usuários
            if (usuario != null && usuario.getSenha().equals(senhaAntiga)) {// Verifica se a senha antiga é igual a senha do usuário
                usuario.setSenha(novaSenha);// Altera a senha do usuário
                return true; // A senha foi alterada com sucesso
            }
        }
        return false;
    }
}

