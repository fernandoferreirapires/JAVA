import java.util.Arrays;

public class array7 {
    public static void main(String[] args) {
        final int tam = 8;
        int p = 0;

        int[] numero = {10, 4, 43, 2,1, 6, 23, 9};
        int[] num = new int[8];

        //Arrays.sort(numero); //ordena os elementos do array
        //Arrays.fill(num, 10); //Preenche o array com o valor indicado
        //System.arraycopy(numero, 0, num, 0, tam);
        
        System.out.printf("O elemento %d esta dentro do Array? %s", p, Arrays.binarySearch(numero, p) > 0 ? "Sim" : "Não"); 

        /*for(int i : num){
            System.out.printf("%d - ", i);
        }*/
    }
}
