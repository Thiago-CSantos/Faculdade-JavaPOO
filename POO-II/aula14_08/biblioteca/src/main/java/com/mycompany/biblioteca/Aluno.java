
package com.mycompany.biblioteca;

import java.util.ArrayList;

public class Aluno extends Pessoa{
    
    private String ra;
    private String curso;

    public Aluno(String ra, String curso, String nome, String dataDeNascimento, Telefone telefone, ArrayList livros) {
        super(nome, dataDeNascimento, telefone, livros);
        this.ra = ra;
        this.curso = curso;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    
}
