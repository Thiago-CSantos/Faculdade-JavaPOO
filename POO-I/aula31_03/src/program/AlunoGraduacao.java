package program;

public class AlunoGraduacao extends Alunos {

    private int anoCurso;
    public AlunoGraduacao(String nome, String rA, String nomeCurso, int anoCurso) {
        super(nome, rA, nomeCurso);
        this.anoCurso = anoCurso;
    }

    public int getAnoCurso() {
        return anoCurso;
    }
    public void setAnoCurso(int anoCurso) {
        this.anoCurso = anoCurso;
    }


}
