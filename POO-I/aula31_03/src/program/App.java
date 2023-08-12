package program;
public class App{

    public static void main(String[] args) {
    Alunos alunos =  new Alunos("Thiago", "28067-4", "EngenhariaSoftware");
    AlunoGraduacao graduacao = new AlunoGraduacao("Rafael", "56546-4", "Pedagogia", 2023);
    AlunoPosGraduacao posGraducao = new AlunoPosGraduacao("Guizeira", "5646465-4", "Ed.Fisica", "Corpo Humano");

    System.out.println(alunos.getNome()+alunos.getRa()+alunos.getNomeCurso());
    System.out.println("\n"+graduacao.getNome()+graduacao.getRa()+graduacao.getNomeCurso()+graduacao.getAnoCurso());
    System.out.println("\n"+posGraducao.getNome()+posGraducao.getRa()+posGraducao.getNomeCurso()+posGraducao.getNomeCurso()+posGraducao.getAreaPesquisa());
    }
}

