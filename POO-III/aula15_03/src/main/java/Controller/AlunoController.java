/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Aluno;
import Model.DAOAluno;
import java.io.IOException;

/**
 *
 * @author Android
 */
public class AlunoController {
    
    private static DAOAluno dao = null;
    
    public AlunoController(){
        if (dao == null) {
            dao = new DAOAluno();
        }
    }
    
    public boolean salvar(String nome, String ra) throws IOException{
        Aluno aluno = new Aluno(nome, ra);
        return dao.cadastra(aluno);
    }
    
}
