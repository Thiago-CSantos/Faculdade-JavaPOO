package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOConta {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/POO3";
    private static final String USER = "root";
    private static final String PASS = "1234";

    public void criaTabelaConta() {
        Connection con = null;
        Statement stmt = null;
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish the connection
            con = DriverManager.getConnection(DB_URL, USER, PASS);

            if (con != null) {
                System.out.println("Connection established.");
            } else {
                System.out.println("Failed to establish connection.");
                return;
            }

            // Create the SQL statement
            String sql = "CREATE TABLE IF NOT EXISTS Conta ("
                    + " idConta INT PRIMARY KEY AUTO_INCREMENT,"
                    + " numConta VARCHAR(255),"
                    + " numAg VARCHAR(255),"
                    + " saldo DOUBLE);";

            // Create and execute the statement
            stmt = con.createStatement();
            stmt.executeUpdate(sql);

            System.out.println("Table 'Conta' created successfully.");

        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        } finally {
            // Close the resources
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    System.err.println("Failed to close statement: " + e.getMessage());
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.err.println("Failed to close connection: " + e.getMessage());
                }
            }
        }
    }
    
    public void insertConta(Conta conta) throws SQLException, ClassNotFoundException{
        Connection con = null;
        // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish the connection
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            
            String sql = 
            "insert into Conta(numConta, numAg,saldo) Values(?,?,?)";
            PreparedStatement comando = con.prepareStatement(sql);
            comando.setString(1, conta.getNumAg());
            comando.setString(2, conta.getNumAg());
            comando.setDouble(3, conta.getSaldo());
            
            comando.executeUpdate();
            con.close();
    }
    
    public void selectConta() throws SQLException, ClassNotFoundException{
        Connection con = null;
        // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish the connection
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            
            String sql = "select * from Conta";
            PreparedStatement comando = con.prepareStatement(sql);
            ResultSet result =  comando.executeQuery();
            System.out.println(result);
            
            
    }
}
