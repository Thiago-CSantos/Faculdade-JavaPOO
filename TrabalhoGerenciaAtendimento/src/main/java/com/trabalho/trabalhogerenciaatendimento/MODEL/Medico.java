package com.trabalho.trabalhogerenciaatendimento.MODEL;

import com.trabalho.trabalhogerenciaatendimento.MODEL.Enum.Especialidade;

import java.util.Date;
import java.util.Objects;

public class Medico {
    private int idMedico;
    private String CRM;
    private String nome;
    private String rg;
    private String cpf;
    private String dataNascimento;
    private String foto;
    private Especialidade especialidade;

    public Medico(String CRM, String nome, String rg, String cpf, String dataNascimento, String foto, Especialidade especialidade) {
        this.CRM = CRM;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.foto = foto;
        this.especialidade = especialidade;
    }

    public Medico(int idMedico, String CRM, String nome, String rg, String cpf, String dataNascimento, String foto, Especialidade especialidade) {
        this.idMedico = idMedico;
        this.CRM = CRM;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.foto = foto;
        this.especialidade = especialidade;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "idMedico=" + idMedico +
                ", CRM='" + CRM + '\'' +
                ", nome='" + nome + '\'' +
                ", rg='" + rg + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", foto='" + foto + '\'' +
                ", especialidade=" + especialidade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Medico medico)) return false;
        return getIdMedico() == medico.getIdMedico() && Objects.equals(getCRM(), medico.getCRM()) && Objects.equals(getNome(), medico.getNome()) && Objects.equals(getRg(), medico.getRg()) && Objects.equals(getCpf(), medico.getCpf()) && Objects.equals(getDataNascimento(), medico.getDataNascimento()) && Objects.equals(getFoto(), medico.getFoto()) && getEspecialidade() == medico.getEspecialidade();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdMedico(), getCRM(), getNome(), getRg(), getCpf(), getDataNascimento(), getFoto(), getEspecialidade());
    }
}
