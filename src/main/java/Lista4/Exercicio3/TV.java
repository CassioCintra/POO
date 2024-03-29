package Lista4.Exercicio3;

public class TV extends Produto{
    private String canal;

    public TV(int numSerial, int volume, String canal) {
        super(numSerial, volume);
        this.canal = canal;
    }

    public String assistir(){
        return this.canal;
    }
    public String trocaCanal(String novoCanal){
        this.canal = novoCanal;
        return this.canal;
    }
    @Override
    public String toString() {
        return super.toString() + " TV{" +
                "canal='" + canal + '\'' +
                '}';
    }
}
