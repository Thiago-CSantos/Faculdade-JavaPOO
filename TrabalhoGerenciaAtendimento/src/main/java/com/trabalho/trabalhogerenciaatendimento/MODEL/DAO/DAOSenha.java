package com.trabalho.trabalhogerenciaatendimento.MODEL.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.trabalho.trabalhogerenciaatendimento.MODEL.Senha;
import com.trabalho.trabalhogerenciaatendimento.MODEL.Enum.Especialidade;

public class DAOSenha {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/GerenciaAtendimento";
    private static final String USER = "root";
    private static final String PASS = "123456";
    private Connection conexao = null;
    private List<Senha> senhaList = new ArrayList<>();

    public DAOSenha() {
    }

    protected void conectar() throws SQLException {
        conexao = DriverManager.getConnection(DB_URL, USER, PASS);
    }

    protected void desconectar() throws SQLException {
        conexao.close();
    }


    public void gerarSenha(Senha senha) {
        PreparedStatement com = null;
    
        try {
            conectar();
            conexao.setAutoCommit(false); 
    
            String sql = "INSERT INTO Senha (es_idPaciente, dataGeracao, especialidade) VALUES (?, ?, ?)";
            com = conexao.prepareStatement(sql);
            
            com.setInt(1, senha.getIdPaciente());
            com.setString(2, senha.getDataGeracao());
            com.setString(3, senha.getEspecialidade().toString());
    
            com.executeUpdate();
            conexao.commit(); // Confirmar a transação
    
            System.out.println("Senha " + senha + " cadastrada com sucesso");

            desconectar();
    
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                if (conexao != null) {
                    conexao.rollback(); // Reverter a transação em caso de erro
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                throw new RuntimeException(ex);
            }
            System.out.println("Erro ao cadastrar paciente: " + e.getMessage());
        } finally {
            try {
                if (com != null) {
                    com.close(); // Fechar o PreparedStatement
                }
                if (conexao != null) {
                    conexao.close(); // Fechar a conexão
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
}
