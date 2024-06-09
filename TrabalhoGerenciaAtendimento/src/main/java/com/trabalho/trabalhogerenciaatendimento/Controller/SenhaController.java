package com.trabalho.trabalhogerenciaatendimento.Controller;

import com.trabalho.trabalhogerenciaatendimento.MODEL.DAO.DAOResponsavel;
import com.trabalho.trabalhogerenciaatendimento.MODEL.DAO.DAOSenha;
import com.trabalho.trabalhogerenciaatendimento.MODEL.Senha;

public class SenhaController {

    private static DAOSenha dao = null;

    public SenhaController() {
        if (dao == null) {
            dao = new DAOSenha();
        }
    }

    public void gerarSenha(Senha senha) {
        dao.gerarSenha(senha);
    }
}
