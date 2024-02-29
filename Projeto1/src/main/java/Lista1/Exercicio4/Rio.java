package Lista1.Exercicio4;

public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;
    public Rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    public void chover(float x){
        this.nivel = this.nivel + x;
    }
    public void ensolarar(float x){
        if ((this.nivel - x) >= 0){
            this.nivel = this.nivel - x;
        }
    }
    public void limpar(){
        this.poluido = false;
    }
    public void sujar(){
        this.poluido = true;
    }
    public void mostrar(){
        System.out.println("Rio: " + this.nome +
                "\nNível: " + this.nivel +
                "\nPoluido: " + this.poluido + "\n");
    }
}
