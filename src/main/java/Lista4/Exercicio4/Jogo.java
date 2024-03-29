package Lista4.Exercicio4;

import java.util.Random;

public class Jogo {
    public static Coisa gerarCoisa(Random random){
        int escolha = random.nextInt(3);
        return switch (escolha) {
            case 0 -> new Papel();
            case 1 -> new Tesoura();
            default -> new Pedra();
         };
    }
    public static void main(String[] args) {
        Random random = new Random();
        boolean jogar = true;
        while (jogar) {
            Coisa jogador = gerarCoisa(random);
            Coisa computador = gerarCoisa(random);

            System.out.println("Jogador = " + jogador.getTipo());
            System.out.println("Computador = " + computador.getTipo());

            if (jogador.ganhaDe(computador)) {
                System.out.println("Jogador Wins!");
            } else if (computador.ganhaDe(jogador)) {
                System.out.println("Computador Wins!");
            } else {
                System.out.println("Empate!");
                 jogar = false;
            }
            System.out.println("---------------------");
        }
    }
}
