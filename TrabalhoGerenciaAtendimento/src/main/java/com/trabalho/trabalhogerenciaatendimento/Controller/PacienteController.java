package com.trabalho.trabalhogerenciaatendimento.Controller;

import com.trabalho.trabalhogerenciaatendimento.MODEL.Paciente;
import com.trabalho.trabalhogerenciaatendimento.MODEL.DAO.DAOPaciente;
import com.trabalho.trabalhogerenciaatendimento.MODEL.DAO.DAOResponsavel;
import com.trabalho.trabalhogerenciaatendimento.MODEL.Responsavel;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PacienteController {

    private static DAOPaciente dao = null;
    private DAOResponsavel daoResponsavel = null;

    public PacienteController() {
        if (dao == null) {
            dao = new DAOPaciente();
        }
        if (daoResponsavel == null) {
            daoResponsavel = new DAOResponsavel();
        }
    }

    public void cadastrarPaciente(Paciente paciente) {
        dao.cadastrarPaciente(paciente);
    }

    public void listarPaciente() {
        dao.listarPaciente();
    }

    public void gerarTableModel(JTable tabelaPacientes) {

        DefaultTableModel modelo = (DefaultTableModel) tabelaPacientes.getModel();
        Object[] objetos = new Object[6];

        List<Paciente> item = dao.listarPaciente();

        for (Paciente paciente : item) {
            objetos[0] = paciente.getNome();
            objetos[1] = paciente.getRg();
            objetos[2] = paciente.getSexo();
            objetos[3] = paciente.getDataNascimento();
            // campos do Responsavel
            Responsavel r = daoResponsavel.getRespoPaciente(paciente.getRg());
            objetos[4] = r.getNome();
            objetos[5] = r.getCpf();
            modelo.addRow(objetos);
        }

    }

}
