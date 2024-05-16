package escola;

import java.util.ArrayList;

public class Disciplina{
    private String nome;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private int cargaHoraria;
    private ArrayList<Professor> professores;
    private ArrayList<Turma> turmas;
    
    public Disciplina(){
        professores = new ArrayList<Professor>();
        turmas = new ArrayList<Turma>();
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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
}
