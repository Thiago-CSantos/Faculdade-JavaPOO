/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabalho.trabalhogerenciaatendimento.Controller;

import com.trabalho.trabalhogerenciaatendimento.MODEL.Paciente;
import com.trabalho.trabalhogerenciaatendimento.MODEL.DAO.DAOPaciente;

/**
 *
 * @author rafap
 */
public class PacienteController {

    private static DAOPaciente dao = null;

    public PacienteController() {
        if (dao == null) {
            dao = new DAOPaciente();
        }
    }
    
    public void cadastrarPaciente(Paciente paciente) {
        dao.cadastrarPaciente(paciente);
    }

    public void listarPaciente() {
        dao.listarPaciente();
    }




}
