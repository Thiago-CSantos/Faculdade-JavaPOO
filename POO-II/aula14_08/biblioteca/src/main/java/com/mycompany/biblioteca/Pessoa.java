package com.mycompany.biblioteca;

import java.util.ArrayList;

public class Pessoa {

    private String nome;
    private String dataDeNascimento;
    private Telefone telefone; // agregação
    private ArrayList livros; // associação 

    public Pessoa(String nome, String dataDeNascimento, Telefone telefone, ArrayList livros) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.telefone = telefone;
        this.livros = livros;
    }

    public void addLivro(Livro livro) {
        if (livro != null) {
            livros.add(livro);
        }
    }

    public void listarLivrosRetirados() {
        if (livros != null && livros.size() > 0) {
            Livro livro;
            System.out.println("Livros retirados por: " + nome);

            for (int aux = 0; aux < livros.size(); aux++) {
                livro = (Livro) livros.get(aux);
                System.out.println("LIVRO -" + (aux + 1) + " : ");
                livro.mostrar();
            }
        } else {
            System.out.println(nome + " não tem livro(s) retirado(s)");
        }
    }

    public void devolverLivro(Livro livroDevolvido) {
        if (livros != null && livros.size() > 0) {
            Livro livro;

            for (int aux = 0; aux < livros.size(); aux++) {
                livro = (Livro) livros.get(aux);

                if (livro.getIsbn().equals(livroDevolvido.getIsbn())) {
                    livros.remove(aux);
                    livroDevolvido.devolverLivro();
                }
            }
        }
    }

    public void retirarLivro(Livro livro){
        if(livro != null){
            addLivro(livro);
            livro.setPessoas(this);
        }
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getTelefone() {
        return "(" + telefone.getDdd() + ")" + telefone.getNumero();
    }

    public void setTelefone(String ddd, String num) {
        telefone.setDdd(ddd);
        telefone.setNumero(num);
    }

    public ArrayList getLivros() {
        return livros;
    }

    public void setLivros(ArrayList livros) {
        this.livros = livros;
    }

}
