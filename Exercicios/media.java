import java.util.Scanner;
public class media {
    public static void main(String[] nando){
        Scanner leia = new Scanner(System.in);

        int i, tam = 3;        
        String nome = "";
        float[] nota = new float[tam];
        float media;

        System.out.print("Informe o nome do aluno: ");
        nome = leia.nextLine();

        for(i = 0; i < tam; i++){
            System.out.printf("Informe a nota %d do aluno: ", i + 1);
            nota[i] = leia.nextFloat();
        }
        media = (nota[0] + nota[1] + nota[2]) / tam;

        System.out.printf("Aluno: %s\n",nome);
        System.out.printf("Primeira nota: %f\n", nota[0]);
        System.out.printf("Segunda nota: %f\n", nota[1]);
        System.out.printf("Terceira nota %f\n", nota[2]);
        System.out.printf("Media: %f", media);
    }
}
