import java.util.Scanner;
public class conversorMoeda{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float real, dolar = 4.98f, conversao;

        System.out.print("Informe o valo rem real: ");
        real = scan.nextFloat();

        conversao = real / dolar;

        System.out.printf("A conversao de %fR$ para dolar é %f$", real, conversao);
    }
}