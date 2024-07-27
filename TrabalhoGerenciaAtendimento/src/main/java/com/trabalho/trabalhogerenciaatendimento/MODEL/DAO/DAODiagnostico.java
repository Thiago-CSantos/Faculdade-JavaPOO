package com.trabalho.trabalhogerenciaatendimento.MODEL.DAO;

import com.trabalho.trabalhogerenciaatendimento.MODEL.Enum.Sexo;
import com.trabalho.trabalhogerenciaatendimento.MODEL.Paciente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAODiagnostico {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/GerenciaAtendimento";
    private static final String USER = "root";
    private static final String PASS = "1234";
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

    public void InsertDiagnostico(String es_idSenha, String es_CRMmedico,
            LocalDateTime data_hora, String diagnostico, String tratamento) throws SQLException {
        try {
            conectar();
            try {                
                conexao.setAutoCommit(false);

                String sql = "INSERT INTO Diagnostico (es_idSenha, es_CRMmedico, data_hora, diagnostico,tratamento )"
                        + " VALUES (?, ?, ?, ?,?)";
                PreparedStatement com = conexao.prepareStatement(sql);

                com.setString(1, es_idSenha);
                com.setString(2, es_CRMmedico);
                com.setTimestamp(3, Timestamp.valueOf(data_hora));
                com.setString(4, diagnostico);
                com.setString(5, tratamento);

                com.executeUpdate();

                conexao.commit();
                com.close();
            } catch (SQLException e) {
                e.printStackTrace();
                try {
                    conexao.rollback();
                } catch (SQLException ex) {
                    Logger.getLogger(DAODiagnostico.class.getName()).log(Level.SEVERE, null, ex);
                }
            } finally {
                conexao.setAutoCommit(true);
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
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
