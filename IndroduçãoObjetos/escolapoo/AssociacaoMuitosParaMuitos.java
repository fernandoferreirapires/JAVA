package escolapoo;

import escola.Disciplina;
import escola.Professor;

public class AssociacaoMuitosParaMuitos{
    public static void main(String[] args) {
        Disciplina disciplina1 = new Disciplina();
        disciplina1.setCargaHoraria(80);
        disciplina1.setName("matematica");

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setCargaHoraria(90);
        disciplina2.setName("portugues");

        Professor professor1 = new Professor();
        professor1.setName("junior");
        professor1.setSalario(10000.00);
        professor1.setFormacaoAcademida("Licenciado");
        professor1.setRegistration(1234);

        Professor professor2 = new Professor();
        professor2.setName("Conceicao");
        professor2.setSalario(1000.00);
        professor2.setFormacaoAcademida("Licenciado");
        professor2.setRegistration(12345);
        
        //relacao junior com matematica
        professor1.addDisciplina(disciplina1);
        disciplina1.addProfessor(professor1);
        
        //relacao junior com portugues
        professor1.addDisciplina(disciplina2);
        disciplina2.addProfessor(professor1);

        //relacao Conceicao com portugues
        professor2.addDisciplina(disciplina2);
        disciplina2.addProfessor(professor2);

        //listar as disciplinas do prefessor junior
        System.out.println("\nDisciplinas no junior");
        for(int i = 0; i < professor1.quantidadeDisciplinas();i++){
            //Disciplina disciplina = professor1.getDisciplina(i);
            //System.out.println(disciplina.getName());
            
            System.out.println(professor1.getDisciplina(i).getName());
        }

        //listar os professores da disciplona de portugues
        System.out.println("\nProfessores de portugues");
        for(int i = 0; i < disciplina2.quantidadeProfessores(); i++){
            System.out.println(disciplina2.getProfessor(i).getName());
        }
    }
}