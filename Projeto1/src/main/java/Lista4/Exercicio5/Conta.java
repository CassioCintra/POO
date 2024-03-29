package Lista4.Exercicio5;

public class Conta {
    protected String nomeCliente;
    protected double salarioCliente;
    protected int numConta;
    protected double saldoConta;
    protected double limite;

    public Conta(){

    }
    public Conta(String nomeCliente, double salarioCliente, int numConta, double saldoConta, double limite) {
        this.nomeCliente = nomeCliente;
        this.salarioCliente = salarioCliente;
        this.numConta = numConta;
        this.saldoConta = saldoConta;
        if(limite <= this.salarioCliente) {
            this.limite = limite;
        }
    }

    public Conta(String nomeCliente, double salarioCliente, int numConta, double saldoConta) {
        this.nomeCliente = nomeCliente;
        this.salarioCliente = salarioCliente;
        this.numConta = numConta;
        this.saldoConta = saldoConta;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void deposito(Double valor){
        this.saldoConta = this.saldoConta + valor;
    }
    public boolean saque(Double valor){
        if (valor <= this.saldoConta){
            this.saldoConta = this.saldoConta - valor;
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldoConta=" + this.saldoConta +
                '}';
    }
}
