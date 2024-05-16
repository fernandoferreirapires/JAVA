//Codigo não FUNCIONANDO
import java.util.Scanner;

public class entrada2{
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        int n1 = 0, n2 = 0, soma = 0;
        String nome = new String("");

        System.out.println("Informe seu nome: ");
            nome = leitor.nextLine();
        System.out.println("Informe um numero: ");
            n1 = leitor.nextInt();
        System.out.println("Informe outro numero: ");
            n2 = leitor.nextInt();

        soma = n1 + n2;

        System.out.printf("%s a soma entre %d, %d e %d é igual a %d", nome, n1, n2, soma);
    }
}
