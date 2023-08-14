package com.mycompany.biblioteca;

public class Livro {
    
    private String nome;
    private String editora;
    private String isbn;
    
    private Pessoa pessoas;

    public Livro(String nome, String editora, String isbn) {
        this.nome = nome;
        this.editora = editora;
        this.isbn = isbn;
    }
    
    
    public void devolverLivro(){
        setPessoas(null);
    }    
    
    public void comQuemEsta(){
        if(pessoas != null){
            System.out.println("O livro "+nome+" está com "+ pessoas.getNome());
        }
        else{
            System.out.println("O livro "+nome+"está disponivel para retirarda");
        }
    }
    
    public void mostrar(){
        System.out.println("Nome: "+ nome);
        System.out.println("Editora: "+ editora);
        System.out.println("ISBN: "+isbn);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Pessoa getPessoas() {
        return pessoas;
    }

    public void setPessoas(Pessoa pessoas) {
        this.pessoas = pessoas;
    }
    
}
