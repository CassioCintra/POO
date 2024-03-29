package Lista4.Exercicio3;

import static java.lang.Math.random;

public class Produto {
    protected int numSerial;
    protected int volume;
    protected String teste;

    public Produto() {
        this.teste = "Não testado";
    }

    public Produto(int numSerial, int volume) {
        this.numSerial = numSerial;
        this.volume = volume;
        this.teste = "Não testado";
    }
    public boolean testaUnidade(){
        double probabilidade = random();

        if(probabilidade <= 0.9) {
            this.teste = "Aprovado";
            return true;
        }
        else {
            this.teste = "Reprovado";
            return false;
        }
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "numSerial=" + numSerial +
                ", volume=" + volume +
                ", teste='" + teste + '\'' +
                '}';
    }
}
