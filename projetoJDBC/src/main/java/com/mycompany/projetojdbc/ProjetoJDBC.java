
package com.mycompany.projetojdbc;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Conta;
import model.DAOConta;

public class ProjetoJDBC {

    public static void main(String[] args) {
        DAOConta dao = new DAOConta();
//        dao.criaTabelaConta();
//        try {
//            dao.insertConta(new Conta("0001", "0001", 20000));
//        } catch (SQLException ex) {
//            Logger.getLogger(ProjetoJDBC.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(ProjetoJDBC.class.getName()).log(Level.SEVERE, null, ex);
//        }
        try {
            System.out.println(dao.selectConta());
        } catch (SQLException ex) {
            Logger.getLogger(ProjetoJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
