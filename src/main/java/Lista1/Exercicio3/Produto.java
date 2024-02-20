package Lista1.Exercicio3;

public class Produto {
    public int id;
    public String descricao;
    public int quantidade;
    public float preco;

    public Produto(int id, String descricao, int quantidade, float preco){
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void comprar(int x){
        this.quantidade = this.quantidade + x;
    }
    public String vender(int x) {
        if ((this.quantidade - x) <= 0) {
            return "Estoque insuficiente!";
        } else {
            this.quantidade = this.quantidade - x;
            return String.valueOf(this.quantidade);
        }
    }
    public void subir(float x){
        this.preco = this.preco + x;
    }
    public String descer(float x){
        if (this.preco - x < 0){
            return "Impossível realizar operação!";
        }
        else {
            this.preco = this.preco - x;
            return String.valueOf(this.preco);
        }
    }
    public void mostrar(){
        System.out.println("Id Produto: " + this.id +
                "\nDescrição: " + this.descricao +
                "\nQuantidade: " + this.quantidade +
                "\nPreço: " + this.preco + "\n");
    }
}
