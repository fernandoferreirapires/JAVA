package escolapoo;

import escola.Disciplina;

public class EscolaPOO {
    static public void main(String[] args){
        Disciplina disciplina1 = new Disciplina();
        disciplina1.setName("Matematica");
        disciplina1.setCargaHoraria(-19);

        System.out.println(disciplina1.getName()+"\n"+disciplina1.getCargaHoraria());
    }
}
