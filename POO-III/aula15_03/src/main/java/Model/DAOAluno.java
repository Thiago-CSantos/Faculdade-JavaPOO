/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Android
 */
public class DAOAluno {
    private List<Aluno> alunos = new ArrayList<Aluno>();
    
    public boolean cadastra(Aluno novo) throws IOException{
        cadastrEmArquivo(novo);
        return alunos.add(novo);
    }
    
    public List<Aluno> listaAlunos(){
        return  alunos;
    }
    public boolean editaAluno(Aluno antigo, Aluno novo){
        if(alunos.contains(antigo)){
            int posicao = alunos.indexOf(antigo);
            alunos.set(posicao,novo);
            return true;
        }
        return false;
    }
    
    public boolean removeAluno(Aluno aluno){
     return alunos.remove(aluno);
    } 
    
    public void cadastrEmArquivo(Aluno novo) throws IOException{
        FileWriter file = new FileWriter("Jholas.txt");
        PrintWriter write = new PrintWriter(file);
        write.print(novo);
        
        write.close();
        file.close();
    }
    
}
