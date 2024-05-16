package escola;

public class Alunos extends Pessoa{
    private Turma turma;

    public Turma getTurma(){
        return turma;
    }
    public void setTurma(Turma turma){
        this.turma = turma;
    }
}
