package com.trabalho.trabalhogerenciaatendimento.Controller;

import com.trabalho.trabalhogerenciaatendimento.MODEL.DAO.DAOMedico;
import com.trabalho.trabalhogerenciaatendimento.MODEL.Medico;

public class MedicoController {
    
    private DAOMedico dao = null;
    
    public MedicoController(){
        dao = new DAOMedico();
    }
    
    public void cadastrarMedico(Medico medico){
        dao.cadastrarMedico(medico);
    }
    
}
