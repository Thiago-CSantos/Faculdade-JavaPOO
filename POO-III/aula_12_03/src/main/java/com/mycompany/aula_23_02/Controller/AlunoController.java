
package com.mycompany.aula_23_02.Controller;

import com.mycompany.aula_23_02.Model.Aluno;
import com.mycompany.aula_23_02.Model.DAOAluno;
import java.util.List;

public class AlunoController {
    
    private DAOAluno dao = null;
            
    public AlunoController(){
    }
    
    public void salvar(String nome, String ra){
        Aluno aluno = new Aluno(nome,ra);
        dao.cadastra(aluno);       
    }
}
