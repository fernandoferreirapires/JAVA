package escola;

import java.util.ArrayList;

public class Professor extends Pessoa{
    private String formacaoAcademida;
    private double salario;

    public Professor(){
        disciplinas = new ArrayList<Disciplina>();
    }

    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Turma> turmas;

    public void aplicarAvaliacao(){

    }

    public String getFormacaoAcademida() {
        return formacaoAcademida;
    }

    public void setFormacaoAcademida(String formacaoAcademida) {
        this.formacaoAcademida = formacaoAcademida;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void addDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }
    public void removeDisciplina(Disciplina disciplina){
        disciplinas.remove(disciplina);
    }
    public int quantidadeDisciplinas(){
        return disciplinas.size();
    }
    public Disciplina getDisciplina(int position){
        return disciplinas.get(position);
    }
}
