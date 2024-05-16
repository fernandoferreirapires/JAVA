package escolapoo;
import java.util.Date;

import escola.Turma;
import escola.Alunos;
import escola.Disciplina;
import escola.Professor;
public class EscolaApp{
    static public void main(String[] args){
        Turma turma1 = new Turma();
        turma1.setAno(1);
        turma1.setSigla('B');

        Disciplina disciplina1 = new Disciplina();
        disciplina1.setNome("Matematica");
        disciplina1.setCargaHoraria(160);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setNome("Ciencias da Natureza");
        disciplina2.setCargaHoraria(90);

        Disciplina disciplina3 = new Disciplina();
        disciplina3.setNome("Portugues");
        disciplina3.setCargaHoraria(160);

        Disciplina disciplina4 = new Disciplina();
        disciplina4.setNome("Geografia");
        disciplina4.setCargaHoraria(90);

        Disciplina disciplina5 = new Disciplina();
        disciplina5.setNome("Historia");
        disciplina5.setCargaHoraria(90);

        Disciplina disciplina6 = new Disciplina();
        disciplina6.setNome("Educação Fisica");
        disciplina6.setCargaHoraria(45);

        Disciplina disciplina7 = new Disciplina();
        disciplina7.setNome("English");
        disciplina7.setCargaHoraria(45);

        turma1.addDisciplina(disciplina1);
        turma1.addDisciplina(disciplina2);
        turma1.addDisciplina(disciplina3);
        turma1.addDisciplina(disciplina4);
        turma1.addDisciplina(disciplina5);
        turma1.addDisciplina(disciplina6);
        turma1.addDisciplina(disciplina7);

        Professor professor1 = new Professor();
        professor1.setFormacaoAcademica("Licenciatura em Matemática");
        professor1.setSalario(100.00); 
        professor1.addTurma(turma1);
        professor1.setNome("Magalhães");
        professor1.setGenero("Marculino");
        turma1.addProfessor(professor1);

        Professor professor2 = new Professor();
        professor2.setFormacaoAcademica("Letras Licenciatura");
        professor2.setSalario(30.00); 
        professor2.addTurma(turma1);
        professor2.setGenero("Feminino");
        professor2.setNome("Joana");
        turma1.addProfessor(professor2);

        Professor professor3 = new Professor();
        professor3.setFormacaoAcademica("Licenciatura em Educacao fisica");
        professor3.setSalario(300.00); 
        professor3.addTurma(turma1);
        professor3.setGenero("Masculino");
        professor3.setNome("Jaguaribaras");
        turma1.addProfessor(professor3);

        Professor professor4 = new Professor();
        professor4.setFormacaoAcademica("Licenciatura em Geografia, Licenciatura em Historia");
        professor4.setSalario(10.00); 
        professor4.addTurma(turma1);
        professor4.setGenero("Masculino");
        professor4.setNome("Jorge");
        turma1.addProfessor(professor4);

        Professor professor5 = new Professor();
        professor5.setFormacaoAcademica("Ciencias da Natureza");
        professor5.setSalario(50.00); 
        professor5.addTurma(turma1);
        professor5.setGenero("Masculino");
        professor5.setNome("Marcos Felipe");
        turma1.addProfessor(professor5);

        Alunos aluno1 = new Alunos();
        aluno1.setDataNascimento(new Date());
        aluno1.setNome("Surume");
        aluno1.setGenero("Masc");
        aluno1.setMatricula(12345);
        aluno1.setTurma(turma1);
        turma1.addAluno(aluno1);

        Alunos aluno2 = new Alunos();
        aluno2.setDataNascimento(new Date());
        aluno2.setNome("Shivera");
        aluno2.setGenero("Fem");
        aluno2.setMatricula(54321);
        aluno2.setTurma(turma1);
        turma1.addAluno(aluno2);

        Alunos aluno3 = new Alunos();
        aluno3.setDataNascimento(new Date());
        aluno3.setNome("Antonio");
        aluno3.setGenero("Masc");
        aluno3.setMatricula(13245);
        aluno3.setTurma(turma1);
        turma1.addAluno(aluno3);

        Alunos aluno4 = new Alunos();
        aluno4.setDataNascimento(new Date());
        aluno4.setNome("Venicios");
        aluno4.setGenero("Masc");
        aluno4.setMatricula(53421);
        aluno4.setTurma(turma1);
        turma1.addAluno(aluno4);

        Alunos aluno5 = new Alunos();
        aluno5.setDataNascimento(new Date());
        aluno5.setNome("Rebeca");
        aluno5.setGenero("Fem");
        aluno5.setMatricula(35412);
        aluno5.setTurma(turma1);
        turma1.addAluno(aluno5);

        professor1.addDisciplina(disciplina1);
        disciplina1.addProfessor(professor1);
        
        professor2.addDisciplina(disciplina7);
        professor2.addDisciplina(disciplina3);
        disciplina7.addProfessor(professor2);
        disciplina3.addProfessor(professor2);

        professor3.addDisciplina(disciplina6);
        disciplina6.addProfessor(professor3);

        professor4.addDisciplina(disciplina4);
        professor4.addDisciplina(disciplina5);
        disciplina4.addProfessor(professor4);
        disciplina5.addProfessor(professor4);
        
        professor5.addDisciplina(disciplina2);
        disciplina2.addProfessor(professor5);

        System.out.println("\nAno " + turma1.getAno()+ " Turma "+turma1.getSigla());

        System.out.println("\nAlunos: ");
        for(int i = 0;i<turma1.qtdAlunos();i++){
            System.out.println(turma1.getAluno(i).getNome());
        }

        System.out.println("\nProfessores: ");
        for(int i = 0;i<turma1.qtdProfessores();i++){
            System.out.println(turma1.getProfessor(i).getNome());
        }

        System.out.println("\nDisciplinas: ");
        for(int i = 0; i < turma1.qtdDisciplinas(); i++){
            System.out.println(turma1.getDisciplina(i).getNome());
        }
    }
}