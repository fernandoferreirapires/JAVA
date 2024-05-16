public class Metodo4 {
    public static void main(String[] args) {
        soma(56, 6);
        soma(4.7, 7.6);
    }
    public static int soma(int n1, int n2) {
        int res = n1 + n2;
        System.out.println(res);
        return res;
    }
    public static double soma(double n1, double n2) {
        double res = n1 + n2;
        System.out.print(res);
        return res;
    }
}