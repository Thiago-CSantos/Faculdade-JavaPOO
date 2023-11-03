<<<<<<< HEAD
package com.mycompany.trabalhomvcswing.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Usuario {

    private static List<Usuario> listaUsuario;
    
    private int id;
    private String email;
    private String senha;

    public Usuario() {
    }

    public Usuario(int id, String email, String senha) {
        this.id = id;
        this.email = email;
        this.senha = senha;
    }
    //getters e setters
    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public static List<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    public static void setListaUsuario(List<Usuario> listaUsuario) {
        Usuario.listaUsuario = listaUsuario;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.email);
        hash = 71 * hash + Objects.hashCode(this.senha);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return Objects.equals(this.senha, other.senha);
    }

    // Metodo ToString para imprimir os dados do objeto
    @Override
    public String toString() {
        return "Usuario{" + "email=" + email + ", senha=" + senha + '}';
    }

    

}
=======
package com.mycompany.trabalhomvcswing.model;

import java.util.Objects;

public class Usuario {

    private String email;
    private String senha;

    public Usuario() {
    }
    
    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.email);
        hash = 71 * hash + Objects.hashCode(this.senha);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return Objects.equals(this.senha, other.senha);
    }

    @Override
    public String toString() {
        return "Usuario{" + "email=" + email + ", senha=" + senha + '}';
    }

}
>>>>>>> 1744141065066c63aba2b0bc5cbc23e1e45e27ff
