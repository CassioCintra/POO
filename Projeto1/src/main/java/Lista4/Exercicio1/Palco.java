package Lista4.Exercicio1;

public class Palco {
    private Ator ator = new AtorFeliz();
    public void alteraTriste() {
        ator = new AtorTriste();
    }
    public void alteraFeliz(){
        ator = new AtorFeliz();
    }
    public void atuar() {
        ator.ato();
    }
}
