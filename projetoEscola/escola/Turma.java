package escola;

import java.util.ArrayList;

public class Turma{
    private char sigla;
    private int ano;
    private ArrayList<Alunos> alunos;
    private ArrayList<Professor> professores;
    private ArrayList<Disciplina> disciplinas;

    public char getSigla(){
        return sigla;
    }

    public void setSigla(char sigla){
        this.sigla = sigla;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void addAluno(Alunos aluno){
        alunos.add(aluno);
    }
    public int qtdAlunos(){
        return alunos.size();
    }
    public Alunos getAluno(int position){
        return alunos.get(position);
    }

    public void addProfessor(Professor professor){
        professores.add(professor);
    }
    public int qtdProfessores(){
        return professores.size();
    }
    public Professor getProfessor(int position){
        return professores.get(position);
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

    public Turma(){
        alunos = new ArrayList<Alunos>();
        professores = new ArrayList<Professor>();
        disciplinas = new ArrayList<Disciplina>();
    }
}
