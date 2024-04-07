package com.mycompany.aula_23_02.Controller;

import com.mycompany.aula_23_02.Model.Aluno;
import com.mycompany.aula_23_02.Model.DAOAluno;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AlunoController {

    private static DAOAluno dao = null;

    public AlunoController() {
        if (dao == null) {
            dao = new DAOAluno();
        }
    }

    public void carregaAlunos() throws FileNotFoundException {
        dao.carregaAlunos();
    }

    public boolean salvar(String nome, String ra) throws IOException {
        Aluno aluno = new Aluno(nome, ra);
        return dao.cadastra(aluno);

    }

    // Gera o modelo de dados para o jTable
    public void gerarTableModel(JTable tabelaAlunos) {
        DefaultTableModel modelo = (DefaultTableModel) tabelaAlunos.getModel();
        Object[] objetos = new Object[2];// quantidade de colunas
        // obter a listagem de alunos
        List<Aluno> alunos = dao.listaAlunos();
        // Para cada aluno da lista colocar o nome e ra dentro de vetor objetos
        for (Aluno aluno : alunos) {
            objetos[0] = aluno.getNome();
            objetos[1] = aluno.getRa();
            // adiciona na tabela uma lina com os dados do aluno
            modelo.addRow(objetos);
        }

    }

    public void deletarAluno(JTable tabelaAlunos, int rowIndex, Aluno aluno, String raRemover) {
        DefaultTableModel modelo = (DefaultTableModel) tabelaAlunos.getModel();
        modelo.removeRow(rowIndex);
        dao.removeAluno(aluno, raRemover);
    }

    public void buscarAluno(JTable jTableAlunos, String nome) {
        DefaultTableModel modelo = (DefaultTableModel) jTableAlunos.getModel();
        boolean encontrou = false;
        List<Aluno> lista = new ArrayList();
        lista = dao.listaAlunos();
        System.out.println("Lista: " + lista);
        for (int i = 0; i < lista.size(); i++) {

            Aluno dados = lista.get(i);

            System.out.println("Dados: " + dados);

            if (dados.getNome().equals(nome)) {
                encontrou = true;
                System.out.println("Aqui");
                modelo.setRowCount(0);
                Aluno rowDados[] = new Aluno[1];
                rowDados[0] = new Aluno(dados.getNome(), dados.getRa());
                modelo.addRow(rowDados);
                return;
            }
        }
        // Se não encontrou
        if (!encontrou) {
            modelo.setRowCount(0);
            String aluno[] = new String[2];

            for (Aluno alunos : lista) {
                aluno[0] = alunos.getNome();
                aluno[1] = alunos.getRa();
                modelo.addRow(aluno);
            }
            JOptionPane.showMessageDialog(null, "Aluno não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void EditarNome(String novoNome, String nomeAntigo) {
        dao.EditarNomeArquivo(novoNome, nomeAntigo);
    }
}
