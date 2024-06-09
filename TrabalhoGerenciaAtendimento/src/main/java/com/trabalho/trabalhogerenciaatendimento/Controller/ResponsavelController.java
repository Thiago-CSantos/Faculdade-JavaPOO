package com.trabalho.trabalhogerenciaatendimento.Controller;

import com.trabalho.trabalhogerenciaatendimento.MODEL.Responsavel;
import com.trabalho.trabalhogerenciaatendimento.MODEL.DAO.DAOResponsavel;
import com.trabalho.trabalhogerenciaatendimento.MODEL.Paciente;

public class ResponsavelController {

    private static DAOResponsavel dao = null;

    public ResponsavelController() {
        if (dao == null) {
            dao = new DAOResponsavel();
        }
    }


    public void cadastrarResponsavel(Responsavel responsavel) {
        dao.cadastrarResponsavel(responsavel);
    }
    
    public Paciente getPaciente(String rg){
        return dao.getPacienteId(rg);
    }

    
}
