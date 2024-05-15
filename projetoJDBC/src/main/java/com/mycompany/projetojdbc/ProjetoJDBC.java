
package com.mycompany.projetojdbc;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DAOConta;

public class ProjetoJDBC {

    public static void main(String[] args) {
        DAOConta dao = new DAOConta();
        dao.criaTabelaConta();
    }
}
