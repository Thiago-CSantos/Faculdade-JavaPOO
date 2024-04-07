/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula_23_02.Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Android
 */
public class DAOAluno {

    private List<Aluno> alunos = new ArrayList<Aluno>();

    public void carregaAlunos() throws FileNotFoundException {
        FileReader arquivo = new FileReader("alunos.txt");
        Scanner leitor = new Scanner(arquivo);

        // enquanto houver linhas no arquivo
        while (leitor.hasNext()) {
            // leia os dados do aluno
            String dados = leitor.nextLine();
            // separar nome do ra, utilizando o - como separador
            String[] info = dados.split(",");

            // fazer como Jake.. pegar os dados do aluno
            String nome = info[0];
            String ra = info[1];

            // montar o "Frankie" ..aluno
            Aluno aluno = new Aluno(nome, ra);

            // cadastrar no Array
            alunos.add(aluno);

        }
    }

    public boolean cadastra(Aluno novo) throws IOException {
        cadastraEmArq(novo);
        return alunos.add(novo);

    }

    public void cadastraEmArq(Aluno novo) throws IOException {
        FileWriter file = new FileWriter("alunos.txt", true);
        PrintWriter writer = new PrintWriter(file);
        writer.print(novo);
        writer.close();
        file.close();

    }

    public List<Aluno> listaAlunos() {
        return alunos;
    }

    public boolean editaAluno(Aluno antigo, Aluno novo) {
        if (alunos.contains(antigo)) {
            int posicao = alunos.indexOf(antigo);
            alunos.set(posicao, novo);
            return true;
        }
        return false;
    }

    public void removeAluno(Aluno aluno, String raRemover) {

        try {
            BufferedReader leitor = new BufferedReader(new FileReader("alunos.txt"));
            List<String> linhas = new ArrayList<>();
            String linha;

            while ((linha = leitor.readLine()) != null) {
                System.out.println("Teste"+ linha);
                if (!linha.contains("," + raRemover)) {
                    linhas.add(linha);
                }
            }
            leitor.close();

            BufferedWriter escritor = new BufferedWriter(new FileWriter("alunos.txt"));
            for (String linhaAtualizada : linhas) {
                escritor.write(linhaAtualizada);
                escritor.newLine(); // Adiciona uma nova linha após cada linha escrita
            }
            escritor.close();

        } catch (Exception e) {
        }
    }

    public void EditarNomeArquivo(String novoNome, String nomeAntigo) {
        try {
            BufferedReader leitor = new BufferedReader(new FileReader("alunos.txt"));
            List<String> linhas = new ArrayList<>();
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length == 2 && partes[0].equals(nomeAntigo)) {
                    partes[0] = novoNome; // Substituir o nome antigo pelo novo nome
                    linha = String.join(",", partes); // Convertendo o array de volta para uma linha
                }
                linhas.add(linha);
            }
            leitor.close();

            BufferedWriter escritor = new BufferedWriter(new FileWriter("alunos.txt"));
            for (String linhaAtualizada : linhas) {
                escritor.write(linhaAtualizada);
                escritor.newLine(); // Adicionando uma nova linha após cada linha escrita
            }
            escritor.close();

            System.out.println("Nome atualizado com sucesso!");

        } catch (IOException e) {
            System.err.println("Erro ao editar o nome no arquivo: " + e.getMessage());
        }
    }
}
