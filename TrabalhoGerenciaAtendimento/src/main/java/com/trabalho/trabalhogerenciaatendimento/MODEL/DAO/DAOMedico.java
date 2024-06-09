package com.trabalho.trabalhogerenciaatendimento.MODEL.DAO;

import com.trabalho.trabalhogerenciaatendimento.MODEL.Enum.Especialidade;
import com.trabalho.trabalhogerenciaatendimento.MODEL.Medico;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAOMedico {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/GerenciaAtendimento";
    private static final String USER = "root";
    private static final String PASS = "123456";
    private Connection conexao = null;
    private List<Medico> medicoList = new ArrayList<>();

    public DAOMedico() {
    }

    protected void conectar() throws SQLException {
        conexao = DriverManager.getConnection(DB_URL, USER, PASS);
    }

    protected void desconectar() throws SQLException {
        conexao.close();
    }

    public List<Medico> listarMedico() {
        try {
            conectar();
            String sql = "SELECT CRM, nome, rg, cpf, dataNascimento, foto, especialidad FROM Medico";
            PreparedStatement com = conexao.prepareStatement(sql);

            ResultSet result = com.executeQuery();

            while (result.next()) {
                String CRM = result.getString(1);
                String nome = result.getString(2);
                String rg = result.getString(3);
                String cpf = result.getString(4);
                String dataNascimento = result.getString(5);
                String foto = result.getString(6);
                Especialidade especialidade = Especialidade.valueOf(result.getString(7));
                medicoList.add(new Medico(CRM, nome, rg, cpf, dataNascimento, foto, especialidade));
            }

            desconectar();
            System.out.println(medicoList);
            return medicoList;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void cadastrarMedico(Medico medico) {
        try {
            conectar();
            String sql = "INSERT INTO Medico (CRM, nome, rg, cpf, dataNascimento, foto, especialidade) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement com = conexao.prepareStatement(sql);

            com.setString(1, medico.getCRM());
            com.setString(2, medico.getNome());
            com.setString(3, medico.getRg());
            com.setString(4, medico.getCpf());
            com.setString(5, medico.getDataNascimento());
            com.setString(6, medico.getFoto());
            com.setString(7, medico.getEspecialidade().toString());

            com.executeUpdate();
            desconectar();

            conexao.commit();

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
}
