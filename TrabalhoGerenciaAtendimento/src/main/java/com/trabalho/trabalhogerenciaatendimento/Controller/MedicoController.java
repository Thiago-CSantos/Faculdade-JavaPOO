package com.trabalho.trabalhogerenciaatendimento.Controller;

import com.trabalho.trabalhogerenciaatendimento.MODEL.DAO.DAOMedico;
import com.trabalho.trabalhogerenciaatendimento.MODEL.Enum.Especialidade;

import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.trabalho.trabalhogerenciaatendimento.MODEL.Medico;
import com.trabalho.trabalhogerenciaatendimento.MODEL.Paciente;
import com.trabalho.trabalhogerenciaatendimento.MODEL.Responsavel;

public class MedicoController {
    
    private DAOMedico dao = null;
    
    public MedicoController(){
        dao = new DAOMedico();
    }
    
    public void cadastrarMedico(Medico medico){
        dao.cadastrarMedico(medico);
    }
    
    public void gerarTableModel2(JTable tabelaMedicos, Especialidade especialidade) {

        DefaultTableModel modelo = (DefaultTableModel) tabelaMedicos.getModel();
        Object[] objetos = new Object[3];

        String especiali = especialidade.toString();
        
        List<Medico> item = dao.listarMedicoByArea(especiali);

        for (Medico medico : item) {
            objetos[0] = medico.getNome();
            objetos[1] = medico.getCRM();
            objetos[2] = medico.getIdMedico();

            modelo.addRow(objetos);
        }

    }

    public void gerarTableModel(JTable tabelaMedicos) {

        DefaultTableModel modelo = (DefaultTableModel) tabelaMedicos.getModel();
        Object[] objetos = new Object[7];

        List<Medico> item = dao.listarMedico();

        for (Medico medico : item) {
            objetos[0] = medico.getCRM();
            objetos[1] = medico.getNome();
            objetos[2] = medico.getRg();
            objetos[3] = medico.getCpf();
            objetos[4] = medico.getDataNascimento();   
            objetos[5] = medico.getFoto();  
            objetos[6] = medico.getEspecialidade();


            modelo.addRow(objetos);
        }

    }
    
}
