package com.trabalho.trabalhogerenciaatendimento.MODEL;

import java.util.Objects;

public class Responsavel {
    private int idResponsavel;
    private int idDependente;
    private String nome;
    private String cpf;

    public Responsavel(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Responsavel(int idResponsavel, int idDependente, String nome, String cpf) {
        this.idResponsavel = idResponsavel;
        this.idDependente = idDependente;
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(int idResponsavel) {
        this.idResponsavel = idResponsavel;
    }

    public int getIdDependente() {
        return idDependente;
    }

    public void setIdDependente(int idDependente) {
        this.idDependente = idDependente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Responsavel{" +
                "idResponsavel=" + idResponsavel +
                ", idDependente=" + idDependente +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Responsavel that)) return false;
        return getIdResponsavel() == that.getIdResponsavel() && getIdDependente() == that.getIdDependente() && Objects.equals(getNome(), that.getNome()) && Objects.equals(getCpf(), that.getCpf());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdResponsavel(), getIdDependente(), getNome(), getCpf());
    }
}
