package questao2;

public class Assistente extends Funcionario{
    
    private int matricula;
    
    public Assistente(String nome, int matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    @Override
    public void imprimir(){
        
    }
    
}
