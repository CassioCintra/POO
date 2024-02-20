package Lista1.Exercicio2;

public class TestaCliente {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente(001,001,"Fulano",0);
        Cliente cliente2 = new Cliente(002, 001, "Beltrano", 100);

        cliente1.getNome();
        cliente1.getNumeroConta();
        cliente1.getSaldo();
        cliente1.mostrar();
        cliente1.realizarDeposito(100);
        cliente1.realizarSaque(50);
        cliente1.mostrar();

        cliente2.getNome();
        cliente2.getNumeroConta();
        cliente2.getSaldo();
        cliente2.mostrar();
        cliente2.realizarDeposito(50);
        cliente2.realizarSaque(30);
        cliente2.mostrar();
    }
}
