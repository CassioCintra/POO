package Lista4.Exercicio4;

public class Tesoura extends Coisa{
    @Override
    public String getTipo(){
        return "Tesoura";
    }

    @Override
    protected boolean ganhaDe(Coisa coisa) {
        return coisa instanceof Papel;
    }

}
