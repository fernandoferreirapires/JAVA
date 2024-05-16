import java.util.Scanner;

public class entrada3{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

        int n1, n2, n3, n4, nota;
        final int media = 24;
        String nome = "", res = "";

        System.out.println("Informe o nome do aluno: ");
        nome = scanner.nextLine();
        System.out.println("Informe a primeira nota do aluno: ");
        n1 = scanner.nextInt();
        System.out.println("Informe a segunda nota do aluno: ");
        n2 = scanner.nextInt();
        System.out.println("Informe a terceira nota do aluno: ");
        n3 = scanner.nextInt();
        System.out.println("Informe a quarta nota do aluno: ");
        n4 = scanner.nextInt();

        nota = n1 + n2 + n3 + n4;

        res = (nota >= media ? "Aprovado!" : "Reprovado!");

        System.out.printf ("Aluno %s com nota %d foi %s", nome, nota, res);
    }
}
