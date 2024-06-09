package com.trabalho.trabalhogerenciaatendimento.MODEL;

import com.trabalho.trabalhogerenciaatendimento.MODEL.Enum.Sexo;

import java.util.List;
import java.util.Objects;

public class Paciente {

    private int idPacientePaciente;
    private String nome;
    private String rg;
    private Sexo sexo;
    private String dataNascimento;
    private List<Senha> senhaAtendimento;

    public Paciente() {
    }

    public Paciente(String nome, String rg, Sexo sexo, String dataNascimento) {
        this.nome = nome;
        this.rg = rg;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public Paciente(int idPacientePaciente, String nome, String rg, Sexo sexo, String dataNascimento) {
        this.idPacientePaciente = idPacientePaciente;
        this.nome = nome;
        this.rg = rg;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public int getIdPacientePaciente() {
        return idPacientePaciente;
    }

    public void setIdPacientePaciente(int idPacientePaciente) {
        this.idPacientePaciente = idPacientePaciente;
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

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Paciente{" + "idPacientePaciente=" + idPacientePaciente + ", nome=" + nome + ", rg=" + rg + ", sexo=" + sexo + ", dataNascimento=" + dataNascimento + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Paciente paciente)) return false;
        return getIdPacientePaciente() == paciente.getIdPacientePaciente() && Objects.equals(getNome(), paciente.getNome()) && Objects.equals(getRg(), paciente.getRg()) && getSexo() == paciente.getSexo() && Objects.equals(getDataNascimento(), paciente.getDataNascimento()) && Objects.equals(senhaAtendimento, paciente.senhaAtendimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdPacientePaciente(), getNome(), getRg(), getSexo(), getDataNascimento(), senhaAtendimento);
    }
}
