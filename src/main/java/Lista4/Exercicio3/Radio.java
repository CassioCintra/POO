package Lista4.Exercicio3;

public class Radio extends Produto {
    private String estacao;
    private String banda;

    public Radio() {
        super();
    }

    public Radio(int numSerial, int volume, String estacao, String banda) {
        super(numSerial, volume);
        this.estacao = estacao;
        this.banda = banda;
    }
    public String escutar(){
        return this.estacao + this.banda;
    }
    public String mudaEstacao(String novaEstacao){
        this.estacao = novaEstacao;
        return this.estacao;
    }
    public String mudaBanda(String novaBanda){
        this.banda = novaBanda;
        return this.banda;
    }

    @Override
    public String toString() {
        return super.toString() + " Radio{" +
                "canal='" + estacao + '\'' +
                ", banda='" + banda + '\'' +
                '}';
    }
}