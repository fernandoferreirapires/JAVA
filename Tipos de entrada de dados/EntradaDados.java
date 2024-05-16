import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaDados{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Informe seu nome: ");
        String nome = reader.readLine();
        System.out.printf("Ola " + nome);

        reader.close();
    } 
}