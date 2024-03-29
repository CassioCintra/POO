package Lista4.Exercicio2;

public class Natal extends CartaoWeb{
    public Natal() {
        super();
    }

    public Natal(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMenssagem() {
        System.out.println("Feliz Natal, " + this.destinatario);
    }
    public void setDestinatario(String destinatario){
        this.destinatario = destinatario;
    }

    @Override
    public String getDestinatario() {
        return super.getDestinatario();
    }
}
