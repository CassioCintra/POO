package Lista1.Exercicio3;

public class TestaProduto {
    public static void main(String[] args){
        Produto produto1 = new Produto(001, "Descrição foda", 3,1.99F);
        Produto produto2 = new Produto(002, "Outra descrição", 7, 4.99F);

        produto1.mostrar();
        produto1.comprar(4);
        produto1.vender(1);
        produto1.subir(1.99F);
        produto1.descer(0.99F);
        produto1.mostrar();

        produto2.mostrar();
        produto2.comprar(7);
        produto2.vender(4);
        produto2.subir(5.50F);
        produto2.descer(0.25F);
        produto2.mostrar();
    }
}
