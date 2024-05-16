import java.util.Scanner;

public class decisoes5{
    public static void main(String[] args){
        int n;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        n = leitor.nextInt();

        switch(n){
            case 1:
            System.out.println("Norte");
            break;
            case 2:
            System.out.println("Sul");
            break;
            case 3: case 4:
            System.out.println("Nordeste");
            break;
            case 5: case 6:
            System.out.println("Centro-Oeste");
            break;
            case 7: case 8: case 9:
            System.out.println("Sudeste");
            break;
            default:
            System.out.println("Importado");
        }
        System.out.println("Fim do programa");
    }
}
