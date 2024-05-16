package Herença;

public class Carro {
    private String name;
    private Boolean on;
    private Boolean destruido;
    private int blindagem;
    private Boolean armamento;

    public Carro(String name){
        this.name = name;
        this.on = false;
        this.destruido = false;
        this.blindagem = 0;
        this.armamento = false;
    }
    public String getName(){
        return this.name;
    }
    public Boolean getOn(){
        return this.on;
    }
    public void setOn(Boolean on){
        this.on = on;
    }
    public Boolean getDestruido(){
        return this.destruido;
    }
    public void setDestruido(Boolean destruido){
        this.destruido = destruido;
    }
    public Boolean getArmamento(){
        return this.armamento;
    }
    public int getBlindagem(){
        return this.blindagem;
    }
    public void sofrerDano(int dano){
        this.blindagem -= dano;
        if(this.blindagem <= 0)
            this.blindagem = 0;
            this.on = false;
            this.destruido = true;
        }
    public void info(){
        System.out.println("----------------------------------------------");
        System.out.printf("Nome...................:%s%n",this.name);
        System.out.printf("Ligado...................:%s%n",this.on ? "Sim" : "Não");
        System.out.printf("Destruido...................:%s%n",this.destruido ? "Sim" : "Não");
        System.out.printf("Blindagem...................:%s%n",this.blindagem);
        System.out.printf("Armamento...................:%s%n",this.armamento ? "Sim" : "Não");
    }
    public static void main(String[] args) {
        Carro car = new Carro("Golf");

        car.setOn(true);
        car.info();
    }
}