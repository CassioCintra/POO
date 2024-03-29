package Lista2.Exercicio1;

import Lista2.Exercicio1.model.Cliente;

public class MainCliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Fulano", "01234-67", "0123-5", 100F);

        cliente.setNome("Fulano");
        cliente.setNumeroConta("01234-67");
        cliente.setNumeroAgencia("0123-5");
        cliente.setSaldo(100F);

        cliente.toString();
        cliente.realizarDeposito(100F);
        cliente.realizarSaque(50.4F);
        cliente.toString();
    }
}
