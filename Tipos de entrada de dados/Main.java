import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // System.out.println();       
        double raio = Double.parseDouble(reader.readLine());
        double n = 3.14159;
        double res =  n * (raio * raio);
        
        System.out.printf("A=%.4f",res); 
        
        reader.close();
    }
}