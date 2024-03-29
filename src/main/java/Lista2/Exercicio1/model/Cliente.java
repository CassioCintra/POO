package Lista2.Exercicio1.model;

public class Cliente {
    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;

    public Cliente(String nome, String numeroConta, String numeroAgencia, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        if(numeroConta.length() == 8 && numeroConta.charAt(5) == '-'){
            this.numeroConta = numeroConta;
        }
        else {
            System.out.println("Numero de Conta invalido!");
        }
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia){
        this.numeroAgencia = numeroAgencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length() <= 30){
            this.nome = nome;
        }
        else {
            System.out.println("Limite de caracteres atingido.");
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        System.out.println("Clinte {" +
                "\nnome = " + this.nome +
                "\nnumeroConta = " + this.numeroConta +
                "\nnumeroAgencia = " + this.numeroAgencia +
                "\nsaldo = " + this.saldo +
                "\n}");
        return null;
    }

    public void realizarDeposito(float deposito){
        this.setSaldo(this.saldo + deposito);
    }
    public void realizarSaque(float saque) {
        if((this.saldo - saque) >= 0){
            this.setSaldo(this.saldo - saque);
        }
        else {
            System.out.println("O saldo não pode ser NEGATIVO!!");
        }
    }
}