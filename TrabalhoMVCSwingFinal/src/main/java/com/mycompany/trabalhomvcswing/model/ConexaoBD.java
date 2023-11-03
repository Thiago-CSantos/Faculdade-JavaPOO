package com.mycompany.trabalhomvcswing.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

    private static Connection conexao = null;
    
    public static Connection conectar() {
        if (conexao == null) {
            String url = "jdbc:mysql://localhost:3306/TrabalhoJavaSwing";
            String usuario = "root";
            String senha = "123456";
            
            try {
                conexao = DriverManager.getConnection(url, usuario, senha);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conexao;
    }
    
}
