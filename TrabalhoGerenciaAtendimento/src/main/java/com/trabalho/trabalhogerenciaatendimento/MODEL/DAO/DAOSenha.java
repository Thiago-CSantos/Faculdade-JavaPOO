package com.trabalho.trabalhogerenciaatendimento.MODEL.DAO;

import com.trabalho.trabalhogerenciaatendimento.MODEL.Paciente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.trabalho.trabalhogerenciaatendimento.MODEL.Senha;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOSenha {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/GerenciaAtendimento";
    private static final String USER = "root";
    private static final String PASS = "1234";
    private Connection conexao = null;
    private PreparedStatement com = null;
    private List<Senha> senhaList = new ArrayList<>();

    public DAOSenha() {
    }

    protected void conectar() throws SQLException {
        conexao = DriverManager.getConnection(DB_URL, USER, PASS);
    }

    protected void desconectar() throws SQLException {
        conexao.close();
    }

    public void gerarSenha(Senha senha) throws SQLException {
        try {
            conectar();
            try {
                conexao.setAutoCommit(false);

                String sql = "INSERT INTO Senha (es_idPaciente, dataGeracao, especialidade) VALUES (?, ?, ?)";

                com = conexao.prepareStatement(sql);

                com.setInt(1, senha.getIdPaciente());
                com.setString(2, senha.getDataGeracao());
                com.setString(3, senha.getEspecialidade().toString());

                com.executeUpdate();
                conexao.commit();

                System.out.println("Senha " + senha.getIdPaciente() + " cadastrada com sucesso");


            } catch (SQLException e) {
                e.printStackTrace();
                try {
                    if (conexao != null) {
                        conexao.rollback();
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    throw new RuntimeException(ex);
                }
                System.out.println("Erro ao cadastrar paciente: " + e.getMessage());
            } finally {
                conexao.setAutoCommit(true);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String getSenha(Paciente rg) {
        try {
            conectar();

            String subquery = "(SELECT idPacientePaciente FROM Paciente WHERE rg = ?)";

            String sql = "SELECT idSenha FROM Senha WHERE es_idPaciente = " + subquery + " AND dataGeracao >= NOW()";

            com = conexao.prepareStatement(sql);
            com.setString(1, rg.getRg());

            ResultSet result = com.executeQuery();
            Integer idSenha = null;
            if (result.next()) {
                idSenha = result.getInt(1);
            }
            System.out.println("Senha: " + idSenha);
            desconectar();
            return idSenha != null ? idSenha.toString() : "error: senha não encontrada ou expirada";

        } catch (SQLException e) {
            e.printStackTrace();
            return "error: " + e.getMessage();
        } finally {
            try {
                if (com != null) {
                    com.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
