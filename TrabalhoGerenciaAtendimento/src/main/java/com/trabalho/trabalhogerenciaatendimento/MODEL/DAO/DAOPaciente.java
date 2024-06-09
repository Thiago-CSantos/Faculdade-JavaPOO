package com.trabalho.trabalhogerenciaatendimento.MODEL.DAO;

import com.trabalho.trabalhogerenciaatendimento.MODEL.Enum.Sexo;
import com.trabalho.trabalhogerenciaatendimento.MODEL.Paciente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAOPaciente {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/GerenciaAtendimento";
    private static final String USER = "root";
    private static final String PASS = "123456";
    private Connection conexao = null;
    private List<Paciente> pacienteList = new ArrayList<>();

    public DAOPaciente() {
    }

    protected void conectar() throws SQLException {
        conexao = conexao = DriverManager.getConnection(DB_URL, USER, PASS);
    }

    protected void desconectar() throws SQLException {
        conexao.close();
    }

    public List<Paciente> listarPaciente() {
        try {
            conectar();
            String sql = "SELECT nome, rg, sexo, dataNascimento FROM Paciente";
            PreparedStatement com = conexao.prepareStatement(sql);

            ResultSet result = com.executeQuery();

            while (result.next()) {
                String nome = result.getString(1);
                String rg = result.getString(2);
                Sexo sexo = Sexo.valueOf(result.getString(3));
                String dataNascimento = result.getString(4);
                pacienteList.add(new Paciente(nome, rg, sexo, dataNascimento));
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
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, paciente.getNome());
            stmt.setString(2, paciente.getRg());
            stmt.setString(3, paciente.getSexo().toString());
            stmt.setDate(4, Date.valueOf(paciente.getDataNascimento()));

            stmt.executeUpdate();

            stmt.close();
            desconectar();

            System.out.println("Paciente cadastrado com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao cadastrar paciente: " + e.getMessage());
        }
    }

}
