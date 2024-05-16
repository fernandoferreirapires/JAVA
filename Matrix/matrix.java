import java.security.SecureRandom;
public class matrix{
    public static void main(String[] args){
        final int colunas = 4, linhas = 3;
        int[][] num = new int[colunas][linhas];

        for(int l = 0; l < colunas; l++){
            for(int c = 0; c < linhas; c++){
                num[l][c] = new SecureRandom().nextInt(50); 
            }
        }
        for(int l = 0; l < colunas; l++){
            for(int c = 0; c < linhas; c++){
                System.out.printf("%d | ", num[l][c]);
            }
            System.out.printf("%n");
        }
    }
}
