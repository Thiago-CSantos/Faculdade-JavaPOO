package com.trabalho.trabalhogerenciaatendimento.Controller;

import com.trabalho.trabalhogerenciaatendimento.MODEL.DAO.DAOSenha;
import com.trabalho.trabalhogerenciaatendimento.MODEL.Paciente;
import com.trabalho.trabalhogerenciaatendimento.MODEL.Senha;
import java.sql.SQLException;

public class SenhaController {

    private static DAOSenha dao = null;

    public SenhaController() {
        if (dao == null) {
            dao = new DAOSenha();
        }
    }

    public void gerarSenha(Senha senha) throws SQLException {
        dao.gerarSenha(senha);
    }
    
    public String getSenha(Paciente paciente){
        return dao.getSenha(paciente);
    }
}
