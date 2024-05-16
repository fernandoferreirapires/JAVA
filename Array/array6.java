import java.util.Scanner;
public class array6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        char[] gabarito = {'a', 'b', 'c', 'd', 'e', 'a'};
        char[] respostas = new char[6];
        int nota = 0;   

        for(int i = 1; i <= gabarito.length; i++){
            System.out.printf("Informe a resposta do item %d ", i);
                respostas[i] = scan.nextLine().charAt(0);
            if(respostas[i] == gabarito[i]){
                nota++;
            }
        }
        System.out.printf("A nota do aluno foi %d", nota);
    }
}
