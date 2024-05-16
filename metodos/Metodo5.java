public class Metodo5 {
    public static void main(String[] args) {
        soma(6,8,4,78);
    }
    public static int soma(int... n){
        int res = 0;
        for(int num:n){
            res+=num;
        }
        System.out.print(res);
        return res;
    }
}
