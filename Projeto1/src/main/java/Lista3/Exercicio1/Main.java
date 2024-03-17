package Lista3.Exercicio1;

public class Main {
    public static void main(String[] args) {

        Product produto1 = new Product("Abroba",3.0F);
        Product produto2 = new Product("Melaum", 5.3F);

        ShoppingCart shoppingCart = new ShoppingCart(1001);
        shoppingCart.setCarItem(produto1, 4);
        shoppingCart.setCarItem(produto2, 2);

        System.out.println(shoppingCart);
    }
}
