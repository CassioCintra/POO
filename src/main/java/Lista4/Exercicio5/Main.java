package Lista4.Exercicio5;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("Clebin",2500.00,1,3000.00,2500);
        conta = new Cartao(conta, "123456");
        ContaEspecial contaEspecial = new ContaEspecial("Jorge", 2000,2,
                                                        7500, 8000);

        System.out.println(conta.toString());
        System.out.println(((Cartao) conta).saldo("123456"));
        System.out.println(((Cartao) conta).saldo("12345"));
        ((Cartao) conta).setSenha("12345");
        ((Cartao) conta).retiradaCartao("1234", 500.00);
        ((Cartao) conta).retiradaCartao("12345", 500.00);
        System.out.println(((Cartao) conta).saldo("12345"));

        System.out.println(contaEspecial.toString());
        contaEspecial.setLimiteEspecial(6000);
        System.out.println(contaEspecial.toString());
    }
}
