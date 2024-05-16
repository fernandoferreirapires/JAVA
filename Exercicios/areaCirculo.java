import java.util.Scanner;
public class areaCirculo {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        float R = 0, res, pi = 3.14f;

        System.out.print("Informe o Raio: ");
        R = leitor.nextFloat();

        res = pi * (R*R);

        System.out.printf("A area do circulo é: %f", res);
    }
}
