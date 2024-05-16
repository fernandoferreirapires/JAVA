public class prints{
    public static void main(String[] args){
        System.out.print("Ola, Fernando ");
        /* print não quebra linha */
        System.out.print("Ola, Mundo \n");

        System.out.println("Ola, Fernando");
        /* println quebra linha */
        System.out.println("Ola, Mundo");

        System.out.printf("%s %d anos de idade%n%f de altura", "Fernando", 18, 1.75 );
        /* printf serve para formatar
         * 
         * %s = string 
         * %d = inteiro 
         * %f = float
         * 
         */
    }
}