public class Jogador {

    private final int maxVidas = 3;
    private int vidas = 0;

    public Jogador(int num){
  
        this.vidas = 1;
        
        System.out.printf("Jogador numero %d criado!\n",num);

    }
    public int getVidas(){
        return this.vidas;
    }

    public void addVidas(){
        if(this.vidas < maxVidas){
            this.vidas++;
        }
    }
}
