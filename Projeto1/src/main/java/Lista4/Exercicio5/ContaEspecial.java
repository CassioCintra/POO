package Lista4.Exercicio5;

public class ContaEspecial extends Conta{
    public ContaEspecial(String nomeCliente, double salarioCliente,
                         int numConta, double saldoConta, double limite) {
        super(nomeCliente, salarioCliente, numConta, saldoConta);
        if(limite <= (3 * this.salarioCliente)){
            this.limite = 3 * this.salarioCliente;
        }
    }
    public void setLimiteEspecial(int limite){
        if(limite <= (3 * this.salarioCliente)){
            this.limite = 3 * this.salarioCliente;
        }
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", salarioCliente=" + salarioCliente +
                ", numConta=" + numConta +
                ", saldoConta=" + saldoConta +
                ", limite=" + limite +
                '}';
    }
}
