package Lista4.Exercicio4;

public class Pedra extends Coisa{
    @Override
    public String getTipo(){
        return "Pedra";
    }

    @Override
    protected boolean ganhaDe(Coisa coisa) {
        return coisa instanceof Tesoura;
    }
}
