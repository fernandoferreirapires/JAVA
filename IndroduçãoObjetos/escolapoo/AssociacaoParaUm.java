package escolapoo;

import java.util.Date;

import escola.Aluno;
import escola.Turma;

public class AssociacaoParaUm {
    public static void main(String[] args) {
        
        Turma turma1 = new Turma();
        turma1.setSigla("1A");
        turma1.setAno(1);

        Aluno aluno1 = new Aluno();
        aluno1.setName("Nando");
        aluno1.setRegistration(321);
        aluno1.setDataNascimento(new Date());
        aluno1.setTurma(turma1);
        turma1.adicionarAluno(aluno1);

        Aluno aluno2 = new Aluno();
        aluno2.setName("Conceicao");
        aluno2.setRegistration(123);
        aluno2.setDataNascimento(new Date());
        aluno2.setTurma(turma1);
        turma1.adicionarAluno(aluno2);

        System.out.println("Dados do aluno 1 ");
        System.out.println(aluno1.getName());
        System.out.println(aluno1.getDataNascimento());
        System.out.println(aluno1.getTurma().getSigla());

        System.out.println("Aluno da turma ");
        for(int i = 0; i < turma1.quantidadeAlunos(); i++){
            System.out.println(turma1.getAluno(i).getName() );
        }
    }
}
