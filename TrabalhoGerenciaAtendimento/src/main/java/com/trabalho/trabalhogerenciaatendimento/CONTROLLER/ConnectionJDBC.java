package com.trabalho.trabalhogerenciaatendimento.CONTROLLER;

import java.sql.*;

public class ConnectionJDBC {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/GerenciaAlunos";
    private static final String USER = "root";
    private static final String PASS = "123456";
    private Connection con = null;

    public boolean openConnection(){
        try {
            con = DriverManager.getConnection(DB_URL,USER,PASS);
            return true;
        }
        catch(SQLException e){
            return false;
        }
    }

}
