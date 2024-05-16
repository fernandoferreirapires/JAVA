import java.security.SecureRandom;
import java.util.Arrays;

public class matrix2 {
    public static void main(String[] args) {
        int rows = 5, columns = 5;
        int[][] number = new int[rows][columns];

        for(int r = 0; r < rows; r++){
            for(int c = 0; c < columns; c++){
                number[r][c] = new SecureRandom().nextInt(50);
            }
        }
        
        for(int r = 0; r < rows; r++){
            for(int c = 0; c < columns; c++){
                System.out.printf("| %2d | ",number[r][c]);
            }
            System.out.print("\n");
        }
    }
}
