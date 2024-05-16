import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Soma {
 
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int soma;
        int A = Integer.parseInt(reader.readLine());
        int B = Integer.parseInt(reader.readLine());
        
        soma = A + B;
        
        System.out.printf("SOMA = %d\n", soma);
        
        reader.close();
    }
 
}
