public class decisoes4 {
    public static void main(String[] args){
        // Resultado de uma corrida

        int posi = 7;

        switch(posi){
            case 1:
                System.out.println("Primeiro lugar");
                break;
            case 2:
                System.out.println("Segundo lugar");
                break;
            case 3:
                System.out.println("Terceiro lugar");
                break;
            case 4: case 5: case 6:
                System.out.println("Premio de participacao");
                break;
            default:
                System.out.println("Não ganha nada");
        }
    }
}
