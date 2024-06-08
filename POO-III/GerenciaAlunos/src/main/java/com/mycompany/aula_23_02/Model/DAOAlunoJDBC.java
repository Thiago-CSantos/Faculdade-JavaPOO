package com.mycompany.aula_23_02.Model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAOAlunoJDBC {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/GerenciaAlunos";
    private static final String USER = "root";
    private static final String PASS = "123456";
    private Connection con = null;

    private List<Aluno> alunos = new ArrayList<>();

    public DAOAlunoJDBC() {

    }

    public void carregaAlunos() {

    }

    public List<Aluno> listaAlunos() {
        try {
            alunos.clear();
            con = DriverManager.getConnection(DB_URL, USER, PASS);

            String sql = "SELECT nome, ra FROM Aluno";

            PreparedStatement com = con.prepareStatement(sql);
            ResultSet result = com.executeQuery();

            while (result.next()) {
                alunos.add(new Aluno(result.getNString(1), result.getString(2)));
            }
            System.out.println(alunos);
            return alunos;

        } catch (SQLException e) {
            System.out.println("ERRO:" + e.getMessage());
            return null;
        }

    }

    public boolean cadastra(Aluno novo) {
        try {

            con = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "INSERT INTO Aluno(nome, ra) VALUES(?, ?)";

            PreparedStatement com = con.prepareStatement(sql);
            com.setString(1, novo.getNome());
            com.setString(2, novo.getRa());

            return com.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println(e.getSQLState());
            return false;
        }
    }

    public boolean ediatrAluno(String novoNome, String ra, int linha) {
        try {
            con = DriverManager.getConnection(DB_URL, USER, PASS);

            String sql = "UPDATE Aluno set nome = ? where ra = ? ";
            PreparedStatement com = con.prepareStatement(sql);
            com.setString(1, novoNome);
            com.setString(2, ra);

            return com.executeUpdate() > 0;

        } catch (SQLException e) {
            return false;
        }
    }

    public void removeAluno(Aluno aluno, String raRemover) {
        try {
            con = DriverManager.getConnection(DB_URL, USER, PASS);

            String sql = "DELETE FROM Aluno where ra = ? ";
            PreparedStatement com = con.prepareStatement(sql);
            com.setString(1, raRemover);
            
            boolean a = com.executeUpdate()>0;
        } catch (SQLException e) {
            System.out.println("ERROR ao excluir");
        }
    }

}
