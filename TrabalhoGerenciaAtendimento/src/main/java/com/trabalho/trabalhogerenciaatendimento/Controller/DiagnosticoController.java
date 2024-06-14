package com.trabalho.trabalhogerenciaatendimento.Controller;

import com.trabalho.trabalhogerenciaatendimento.MODEL.DAO.DAODiagnostico;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class DiagnosticoController {

    private DAODiagnostico dao = null;

    public DiagnosticoController() {
        dao = new DAODiagnostico();
    }

    public void InsertDiagnostico(String es_idSenha, String es_CRMmedico,
            LocalDateTime data_hora, String diagnostico, String tratamento) throws SQLException {
        
        dao.InsertDiagnostico(es_idSenha, es_CRMmedico, data_hora, diagnostico, tratamento);
        
    }
}
