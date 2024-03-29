package Lista4.Exercicio5;

public class Cartao extends Conta{
    Conta conta;
    String senha;

    public Cartao(Conta conta, String senha) {
        this.conta = conta;
        this.senha = senha;
    }

    public void retiradaCartao(String senha, Double valor){
        if(this.senha.equals(senha)){
            if (conta.saldoConta > 0) {
                conta.saldoConta = conta.saldoConta - valor;
                System.out.println("Retirada de R$" + valor + " Realizada");
            }
            else {
                System.out.println("Saldo Insuficiente!");
            }
        }
        else {
            System.out.println("Senha errada!");
        }
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public String saldo(String senha) {
        if(this.senha.equals(senha)) {
            return String.valueOf(conta.saldoConta);
        }
        else {
            return "Senha incorreta";
        }
    }
}
