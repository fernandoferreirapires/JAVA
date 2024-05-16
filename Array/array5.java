import java.util.Scanner;
public class array5 {
    public static void main(String[] args){
        final int tama = 5;
        char[] gabarito = {'e','d','c','b','a'};
        char[] respostas = new char[tama];  
        int nota = 0;
        
        Scanner leitor = new Scanner(System.in);

        for(int i = 0; i < tama; i++){
            System.out.printf("Informe a resposta %d", i );
                respostas[i] = leitor.nextLine().charAt(0);

                if(gabarito[i] == respostas[i]){
                    nota++;
                }
        }
        
        System.out.printf("%nA nota do aluno é: %d",nota);
    }
}
