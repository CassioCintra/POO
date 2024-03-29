package Lista4.Exercicio4;

public class Papel extends Coisa{
    @Override
    public String getTipo(){
        return "Papel";
    }

    @Override
    protected boolean ganhaDe(Coisa coisa) {
        return coisa instanceof Pedra;
    }
}
