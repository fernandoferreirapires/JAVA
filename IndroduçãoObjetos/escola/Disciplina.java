package escola;

import java.util.ArrayList;

public class Disciplina {
    private String name;
    private int cargaHoraria;

    public Disciplina(){
        professores = new ArrayList<Professor>();
    }
    
    private ArrayList<Professor> professores;
    private ArrayList<Turma> turmas;

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        if(cargaHoraria >= 0){
            this.cargaHoraria = cargaHoraria;
        }
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void addProfessor(Professor professor){
        professores.add(professor);
    }
    public void removeProfessor(Professor professor){
        professores.remove(professor);
    }
    public int quantidadeProfessores(){
        return professores.size();
    }
    public Professor getProfessor(int position){
        return professores.get(position);
    }
}
