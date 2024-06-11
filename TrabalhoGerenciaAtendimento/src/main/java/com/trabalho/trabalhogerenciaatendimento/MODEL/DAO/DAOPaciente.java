package com.trabalho.trabalhogerenciaatendimento.MODEL.DAO;

import com.trabalho.trabalhogerenciaatendimento.MODEL.Enum.Sexo;
import com.trabalho.trabalhogerenciaatendimento.MODEL.Paciente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAOPaciente {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/GerenciaAtendimento";
    private static final String USER = "root";
    private static final String PASS = "3443";
    private Connection conexao = null;
    private List<Paciente> pacienteList = new ArrayList<>();

    public DAOPaciente() {
    }

    protected void conectar() throws SQLException {
        conexao = DriverManager.getConnection(DB_URL, USER, PASS);
    }

    protected void desconectar() throws SQLException {
        conexao.close();
    }

    public List<Paciente> listarPaciente() {
        try {
            conectar();
            String sql = "SELECT nome, rg, sexo, dataNascimento, idPacientePaciente FROM Paciente";
            PreparedStatement com = conexao.prepareStatement(sql);

            ResultSet result = com.executeQuery();

            while (result.next()) {
                String nome = result.getString(1);
                String rg = result.getString(2);
                Sexo sexo = Sexo.valueOf(result.getString(3));
                String dataNascimento = result.getString(4);
                int idPaciente = result.getInt(5);
                pacienteList.add(new Paciente(idPaciente,nome, rg, sexo, dataNascimento));
            }

            desconectar();
            System.out.println(pacienteList);
            return pacienteList;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void cadastrarPaciente(Paciente paciente) {
        try {
            conectar();
            String sql = "INSERT INTO Paciente (nome, rg, sexo, dataNascimento) VALUES (?, ?, ?, ?)";
            PreparedStatement com = conexao.prepareStatement(sql);

            com.setString(1, paciente.getNome());
            com.setString(2, paciente.getRg());
            com.setString(3, paciente.getSexo().toString());
            com.setDate(4, Date.valueOf(paciente.getDataNascimento()));

            com.executeUpdate();
//            com.close();
            desconectar();

            conexao.commit();
            System.out.println("Paciente cadastrado com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
            try {
                conexao.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            System.out.println("Erro ao cadastrar paciente: " + e.getMessage());
        }
    }

    public int getIdPaciente(String rg) {
        try {
            conectar();
            String sql = "SELECT idPacientePaciente FROM Paciente WHERE rg = ?";
            PreparedStatement com = conexao.prepareStatement(sql);
            com.setString(1, rg);

            ResultSet result = com.executeQuery();
            int id = 0;
            while (result.next()) {
                id = result.getInt(1);
            }

            desconectar();
            return id;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
