package com.trabalho.trabalhogerenciaatendimento.MODEL;

import com.trabalho.trabalhogerenciaatendimento.MODEL.Enum.Especialidade;

import java.util.Date;
import java.util.Objects;

public class Senha {
    private int idSenha;
    private String dataGeracao;
    private Date dataGeracaoa;
    private Especialidade especialidade;
    private int idPaciente;

    public Senha() {
    }

    public Senha(String dataGeracao, Especialidade especialidade, int idPaciente) {
        this.dataGeracao = dataGeracao;
        this.especialidade = especialidade;
        this.idPaciente = idPaciente;
    }

    public Senha(Date dataGeracao, Especialidade especialidade, int idPaciente) {
        this.dataGeracaoa = dataGeracao;
        this.especialidade = especialidade;
        this.idPaciente = idPaciente;
    }

    public Senha(int idSenha, String dataGeracao, Especialidade especialidade, int idPaciente) {
        this.idSenha = idSenha;
        this.dataGeracao = dataGeracao;
        this.especialidade = especialidade;
        this.idPaciente = idPaciente;
    }

    public int getIdSenha() {
        return idSenha;
    }

    public void setIdSenha(int idSenha) {
        this.idSenha = idSenha;
    }

    public String getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(String dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    @Override
    public String toString() {
        return "Senha{" +
                "idSenha=" + idSenha +
                ", dataGeracao=" + dataGeracao +
                ", especialidade=" + especialidade +
                ", idPaciente=" + idPaciente +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Senha senha)) return false;
        return getIdSenha() == senha.getIdSenha() && getIdPaciente() == senha.getIdPaciente() && Objects.equals(getDataGeracao(), senha.getDataGeracao()) && getEspecialidade() == senha.getEspecialidade();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdSenha(), getDataGeracao(), getEspecialidade(), getIdPaciente());
    }
}
