package com.trabalho.trabalhogerenciaatendimento.MODEL.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.trabalho.trabalhogerenciaatendimento.MODEL.Paciente;
import com.trabalho.trabalhogerenciaatendimento.MODEL.Responsavel;
import com.trabalho.trabalhogerenciaatendimento.MODEL.Enum.Sexo;

public class DAOResponsavel {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/GerenciaAtendimento";
    private static final String USER = "root";
    private static final String PASS = "123456";
    private Connection conexao = null;
    private List<Responsavel> responsavelList = new ArrayList<>();

    public DAOResponsavel() {
    }

    protected void conectar() throws SQLException {
        conexao = DriverManager.getConnection(DB_URL, USER, PASS);
    }

    protected void desconectar() throws SQLException {
        conexao.close();
    }

    public List<Responsavel> listarPaciente() {
        try {
            conectar();
            String sql = "SELECT  nome, cpf FROM Responsavel";
            PreparedStatement com = conexao.prepareStatement(sql);

            ResultSet result = com.executeQuery();

            while (result.next()) {
                String nome = result.getString(1);
                String cpf = result.getString(2);
                responsavelList.add(new Responsavel(nome, cpf));
            }

            desconectar();
            System.out.println(responsavelList);
            return responsavelList;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void cadastrarResponsavel(Responsavel responsavel) {
        try {
            conectar();
            String sql = "INSERT INTO Paciente (nome, cpf) VALUES (?, ?)";
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, responsavel.getNome());
            stmt.setString(2, responsavel.getCpf());

            stmt.executeUpdate();
            desconectar();

            
            
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao cadastrar paciente: " + e.getMessage());
        }
    }
}
