package program;

public class Alunos {

    private String nome;
    private String ra;
    private String nomeCurso;


    public Alunos(String nome, String rA, String nomeCurso) {
        this.nome = nome;
        this.ra = rA;
        this.nomeCurso = nomeCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }


    
}