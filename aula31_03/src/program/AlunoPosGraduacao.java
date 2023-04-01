package program;

public class AlunoPosGraduacao extends Alunos {
    
    String areaPesquisa;

    public AlunoPosGraduacao(String nome, String rA, String nomeCurso, String areaPesquisa){
        super(nome, rA, nomeCurso);
        this.areaPesquisa = areaPesquisa;
    }

    public String getAreaPesquisa(){
        return this.areaPesquisa;
    }

    public void setAreaPesquisa(String areaPesquisa2){
        this.areaPesquisa = areaPesquisa2;
    }

}
