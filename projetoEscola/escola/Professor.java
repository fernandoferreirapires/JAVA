package escola;

import java.util.ArrayList;

public class Professor extends Pessoa{
    private double salario;
    private String formacaoAcademica;
    private ArrayList<Turma> turmas;
    private ArrayList<Disciplina> disciplinas;
    public Professor(){
        turmas = new ArrayList<Turma>();
        disciplinas = new ArrayList<Disciplina>();
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public String getFormacaoAcademica(){
        return formacaoAcademica;
    }

    public void setFormacaoAcademica(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public void addTurma(Turma turma){
        turmas.add(turma);
    }
    public int qtdTurmas(){
        return turmas.size();
    }
    public Turma getTurma(int position){
        return turmas.get(position);
    }

    public void addDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }
    public int qtdDisciplinas(){
        return disciplinas.size();
    }
    public Disciplina getDisciplina(int position){
        return disciplinas.get(position);
    }
}