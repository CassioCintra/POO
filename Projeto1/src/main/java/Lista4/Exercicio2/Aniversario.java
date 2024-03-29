package Lista4.Exercicio2;
    public class Aniversario extends CartaoWeb{
    public Aniversario() {
        super();
    }

    public Aniversario(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMenssagem() {
        System.out.println("Feliz aniversário, " + this.destinatario);
    }
    public void setDestinatario(String Destinatario){
        this.destinatario = destinatario;
    }

    @Override
    public String getDestinatario() {
        return super.getDestinatario();
    }
}
