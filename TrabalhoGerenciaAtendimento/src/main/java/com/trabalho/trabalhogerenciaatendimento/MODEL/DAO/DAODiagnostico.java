/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabalho.trabalhogerenciaatendimento.MODEL.DAO;

import com.trabalho.trabalhogerenciaatendimento.MODEL.Enum.Sexo;
import com.trabalho.trabalhogerenciaatendimento.MODEL.Paciente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafap
 */
public class DAODiagnostico {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/GerenciaAtendimento";
    private static final String USER = "root";
    private static final String PASS = "3443";
    private Connection conexao = null;
    private List<Paciente> pacienteList = new ArrayList<>();

    public DAODiagnostico() {
    }

    protected void conectar() throws SQLException {
        conexao = DriverManager.getConnection(DB_URL, USER, PASS);
    }

    protected void desconectar() throws SQLException {
        conexao.close();
    }

    public List<Paciente> listarDiagnostico() {
        try {
            conectar();
            

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

//    public void cadastrarDiagnostico(Diagnostico diagnostico,) {
//        try {
//            conectar();
//            String sql = "INSERT INTO Diagnostico (nome, rg, sexo, dataNascimento) VALUES (?, ?, ?, ?)";
//            PreparedStatement com = conexao.prepareStatement(sql);
//
//            com.setString(1, paciente.getNome());
//            com.setString(2, paciente.getRg());
//            com.setString(3, paciente.getSexo().toString());
//            com.setDate(4, Date.valueOf(paciente.getDataNascimento()));
//
//            com.executeUpdate();
////            com.close();
//            desconectar();
//
//            conexao.commit();
//            System.out.println("Paciente cadastrado com sucesso!");
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//            try {
//                conexao.rollback();
//            } catch (SQLException ex) {
//                throw new RuntimeException(ex);
//            }
//            System.out.println("Erro ao cadastrar paciente: " + e.getMessage());
//        }
//    }
}
