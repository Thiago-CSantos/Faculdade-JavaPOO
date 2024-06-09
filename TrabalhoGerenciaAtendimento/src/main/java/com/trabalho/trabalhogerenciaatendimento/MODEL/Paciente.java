package com.trabalho.trabalhogerenciaatendimento.MODEL;

import com.trabalho.trabalhogerenciaatendimento.MODEL.Enum.Sexo;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Paciente {

    private int idPacientePaciente;
    private String nome;
    private String rg;
    private Sexo sexo;
    private Date dataNascimento;
    private List<Senha> senhaAtendimento;

    public Paciente() {
    }

    public Paciente(int idPacientePaciente, String nome, String rg, Sexo sexo, Date dataNascimento) {
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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Paciente{" + "idPacientePaciente=" + idPacientePaciente + ", nome=" + nome + ", rg=" + rg + ", sexo=" + sexo + ", dataNascimento=" + dataNascimento + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.idPacientePaciente;
        hash = 67 * hash + Objects.hashCode(this.nome);
        hash = 67 * hash + Objects.hashCode(this.rg);
        hash = 67 * hash + Objects.hashCode(this.sexo);
        hash = 67 * hash + Objects.hashCode(this.dataNascimento);
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
        final Paciente other = (Paciente) obj;
        if (this.idPacientePaciente != other.idPacientePaciente) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.rg, other.rg)) {
            return false;
        }
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        return Objects.equals(this.dataNascimento, other.dataNascimento);
    }

}
