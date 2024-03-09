/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula_23_02.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Android
 */
public class DAOAluno {
    private List<Aluno> alunos = new ArrayList<Aluno>();
    
    public boolean cadastra(Aluno novo){
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
}
