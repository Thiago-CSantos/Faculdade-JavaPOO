package com.mycompany.trabalhomvcswing.controller;

import com.mycompany.trabalhomvcswing.model.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OperacaoBD {

    public static boolean consultarDadosEspecificoLogin(String email, String senha){
        Connection conexao = ConexaoBD.conectar();
        
        if(conexao != null){
            try {
                Statement stmt = conexao.createStatement();
                ResultSet resultado = stmt.executeQuery("SELECT email, senha FROM Usuario");
                
                while(resultado.next()){
                    String coluna1 = resultado.getString("email");
                    String coluna2 = resultado.getString("senha");
                    if(coluna1.equals(email) && coluna2.equals(senha)){
                        return true;
                    }
                }
                
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    
    public static boolean consultarDadosEspecifico(String email){
        Connection conexao = ConexaoBD.conectar();
        
        if(conexao != null){
            try {
                Statement stmt = conexao.createStatement();
                ResultSet resultado = stmt.executeQuery("SELECT email, senha FROM Usuario");
                
                while(resultado.next()){
                    String coluna1 = resultado.getString("email");
                    String coluna2 = resultado.getString("senha");
                    if(coluna1.equals(email)){
                        return true;
                    }
                }
                
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    
    public static void consultarDados() {

        Connection conexao = ConexaoBD.conectar();

        if (conexao != null) {
            try {
                Statement stmt = conexao.createStatement();
                String consulta = "SELECT * FROM Usuario";
                ResultSet resultado = stmt.executeQuery(consulta);

                while (resultado.next()) {
                    String coluna1 = resultado.getString("email");
                    String coluna2 = resultado.getString("senha");
                    System.out.println("E-mail = " + coluna1 + "\n Senha = " + coluna2);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    public static void inserirDados(String email, String senha) {
        Connection conexao = ConexaoBD.conectar();

        if (conexao != null) {
            try {
                String insercao = "INSERT INTO Usuario(email, senha) VALUES(?, ?)";
                PreparedStatement stmt = conexao.prepareStatement(insercao);

                stmt.setString(1, email);
                stmt.setString(2, senha);
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
