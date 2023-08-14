package com.mycompany.biblioteca;

import java.util.ArrayList;

public class Professor extends Pessoa{
    
    private String titulacao;
    private String dataContratacao;

    public Professor(String nome, String dataDeNascimento, Telefone telefone, ArrayList livros) {
        super(nome, dataDeNascimento, telefone, livros);
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }
    
    
}
