package Lista4.Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CartaoWeb> cartao = new ArrayList<CartaoWeb>();

        cartao.add(new Aniversario("Crebin"));
        cartao.add(new DiaDosNamorados("Creuza"));
        cartao.add(new Natal("Jurema"));

        // Percorre o vetor chamando o showMenssagem()
        for (CartaoWeb item: cartao) {
            item.showMenssagem();
            // Aqui ocorre o Polimorfismo
        }
    }
}
