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

public class DAOResponsavel {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/GerenciaAtendimento";
    private static final String USER = "root";
    private static final String PASS = "1234";
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

    public void cadastrarResponsavel(Responsavel responsavel) throws SQLException {
        try {
            conectar();
            try {
                conexao.setAutoCommit(false);
                String sql = "INSERT INTO Responsavel (nome, cpf, es_idDependente) VALUES (?, ?, ?)";
                PreparedStatement stmt = conexao.prepareStatement(sql);

                stmt.setString(1, responsavel.getNome());
                stmt.setString(2, responsavel.getCpf());
                stmt.setInt(3, responsavel.getIdDependente());

                stmt.executeUpdate();
                conexao.commit();

            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Erro ao cadastrar paciente: " + e.getMessage());
            } finally {
                conexao.setAutoCommit(true);
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public Paciente getPacienteId(String rgPaciente) {
        try {
            conectar();
            String sql = "SELECT idPacientePaciente FROM Paciente where rg = " + rgPaciente;

            PreparedStatement com = conexao.prepareStatement(sql);

            ResultSet result = com.executeQuery();
            Paciente paciente = null;
            while (result.next()) {
                paciente = new Paciente(result.getInt(1));
            }
            System.out.println("Paciente: " + paciente);
            return paciente;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public Responsavel getRespoPaciente(String rgPaciente) {
        try {
            conectar();
            String sql = "select r.nome, r.cpf from Responsavel r left join Paciente p on p.idPacientePaciente = r.es_idDependente where p.rg = " + rgPaciente + " OR p.rg IS NULL";

            PreparedStatement com = conexao.prepareStatement(sql);

            ResultSet result = com.executeQuery();
            Responsavel responsavel = null;
            while (result.next()) {
                responsavel = new Responsavel(result.getString(1), result.getString(2));
            }
            System.out.println("Paciente: " + responsavel);
            return responsavel;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Responsavel getResponsavel(int idPaciente) {;
        try {
            conectar();
            String sql = "SELECT nome, cpf FROM Responsavel where es_idDependente = " + idPaciente;

            PreparedStatement com = conexao.prepareStatement(sql);

            ResultSet result = com.executeQuery();
            Responsavel responsavel = null;
            while (result.next()) {
                responsavel = new Responsavel(result.getString(1), result.getString(2));
            }
            System.out.println("Responsavel: " + responsavel);
            return responsavel;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
