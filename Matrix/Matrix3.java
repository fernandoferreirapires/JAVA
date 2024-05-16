import java.security.SecureRandom;
public class Matrix3 {
    public static void main(String[] args) {
        int co = 4, ro = 6;
        int[][] num = new int[ro][co];

        for(int r = 0; r < ro; r++){
            for(int c = 0; c < co; c++){
                num[r][c] = new SecureRandom().nextInt(67);
            }
        }
        /*for(int r = 0; r < ro; r++){
            for(int c = 0; c < co; c++){
                System.out.printf("%2d | ", num[r][c]);
            }
            System.out.printf("\n");
        }*/
        for(int[] n:num){
            for(int v:n){
                System.out.printf("%2d | ", v);
            }
            System.out.printf("\n");
        }
    }
}
