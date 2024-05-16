public class decisoes{
    public static void main(String[] args){

        int nota = 50;
        int media = 60;
        int faltas = 17;
        int maxFaltas = 7;

        if(nota >= media && faltas <= maxFaltas){
            System.out.println("Aprovado!");
        }
        else if(nota >= 50 && faltas <= maxFaltas){
            System.out.println("Recuperacao");
        }
        else{
            System.out.println("Fracassado!");
        }
    }
}