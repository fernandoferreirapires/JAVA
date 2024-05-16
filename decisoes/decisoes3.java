public class decisoes3 {
    public static void main(String[] args){
        // Vota ou não vota
        int idade = 66;

        if(idade < 16){
            System.out.println("Não vota!");
        }
        else if(idade < 18 || idade > 65){
            System.out.println("Voto opcional!");
        }
        else{
            System.out.println("Voto obrigatório!");
        }
    }
}
