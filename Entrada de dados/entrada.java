import java.util.Scanner;

public class entrada{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int n1 = 0, n2 = 0, res = 0;

        System.out.print("Digite um numero: ");
        n1 = leitor.nextInt();
        System.out.print("Digite outro numero: ");
        n2 = leitor.nextInt();

        res =  n1 + n2;

        System.out.printf("Soma de %d e %d é igual a %d", n1, n2, res);
    }
}