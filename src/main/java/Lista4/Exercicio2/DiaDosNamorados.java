package Lista4.Exercicio2;

public class DiaDosNamorados extends CartaoWeb{
    public DiaDosNamorados() {
        super();
    }

    public DiaDosNamorados(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMenssagem() {
        System.out.println("Feliz Dias dos Namorados, " + this.destinatario);
    }
    public void setDestinatario(String destinatario){
        this.destinatario = destinatario;
    }

    @Override
    public String getDestinatario() {
        return super.getDestinatario();
    }
}
