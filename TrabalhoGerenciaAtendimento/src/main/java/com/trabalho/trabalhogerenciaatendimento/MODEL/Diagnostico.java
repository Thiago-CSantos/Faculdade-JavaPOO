package com.trabalho.trabalhogerenciaatendimento.MODEL;

import java.util.Date;
import java.util.Objects;

public class Diagnostico {

    private int idDiagnostico;
    private int idSenha;
    private String CRMmedico;
    private Date dataHora;
    private String diagnostico;
    private String tratamento;

    public Diagnostico() {
    }

    public Diagnostico(int idDiagnostico, int idSenha, String CRMmedico, Date dataHora, String diagnostico, String tratamento) {
        this.idDiagnostico = idDiagnostico;
        this.idSenha = idSenha;
        this.CRMmedico = CRMmedico;
        this.dataHora = dataHora;
        this.diagnostico = diagnostico;
        this.tratamento = tratamento;
    }

    public int getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(int idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public int getIdSenha() {
        return idSenha;
    }

    public void setIdSenha(int idSenha) {
        this.idSenha = idSenha;
    }

    public String getCRMmedico() {
        return CRMmedico;
    }

    public void setCRMmedico(String CRMmedico) {
        this.CRMmedico = CRMmedico;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamento() {
        return tratamento;
    }

    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Diagnostico that)) return false;
        return getIdDiagnostico() == that.getIdDiagnostico() && getIdSenha() == that.getIdSenha() && Objects.equals(getCRMmedico(), that.getCRMmedico()) && Objects.equals(getDataHora(), that.getDataHora()) && Objects.equals(getDiagnostico(), that.getDiagnostico()) && Objects.equals(getTratamento(), that.getTratamento());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdDiagnostico(), getIdSenha(), getCRMmedico(), getDataHora(), getDiagnostico(), getTratamento());
    }
}
