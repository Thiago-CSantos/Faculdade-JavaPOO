package Controller;

import Model.Aluno;
import Model.DAOAluno;
import java.io.IOException;

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
    
    public void teste(){
        dao.carregarAlunos();
    }
    
}
