package Lista1.Exercicio2;

public class Cliente {
    public int numeroConta;
    public int numeroAgencia;
    public String nome;
    public float saldo;
    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo){
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }
    public double realizarDeposito(float valor){
        this.saldo = this.saldo + valor;
        return this.saldo;
    }
    public String realizarSaque(float valor){
        if((this.saldo - valor) < 0){
            return "Não foi possível realizar o saque";
        }
        else {
            this.saldo = this.saldo - valor;
            return String.valueOf(this.saldo);
        }
    }
    public int getNumeroConta() { return numeroConta; }
    public String getNome() { return nome; }
    public float getSaldo() { return saldo; }
    public void mostrar(){
        System.out.println("O número da conta: " + this.getNumeroConta() +
                "\nO nome: " + this.getNome() +
                "\nSaldo: " + this.getSaldo() + "\n");
    }

}