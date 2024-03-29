package Lista4.Exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Controle {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new TV(1, 14,"Globo"));
        produtos.add(new Radio(2,10,"93.4","FM"));

        for(Produto produto: produtos){
            boolean chance = produto.testaUnidade();
            System.out.println(produto.toString());

            if(produto instanceof TV){
                TV tv = (TV) produto;
                if (chance == true){
                    tv.trocaCanal("SBT");
                    produto.setVolume(25);
                    System.out.println(tv.assistir());
                }
                else {
                    System.out.println(tv.teste);
                }
            }
            else if(produto instanceof Radio){
                Radio radio = (Radio) produto;
                if(chance == true) {
                    radio.mudaEstacao("104.6");
                    radio.mudaBanda("AM");
                    produto.setVolume(25);
                    System.out.println(radio.escutar());
                }
                else {
                    System.out.println(radio.teste);
                }
            }
            System.out.println(produto.toString());
        }
    }
}
