package Lista5.Exercicio1;

public class Pessoa extends Animal implements Cidadao, Contribuinte, Professor{
    @Override
    public void pagaIR() {
        System.out.println("Pagou Imposto de Renda");
    }

    @Override
    public void getCPF() {
        System.out.println("Este é o CPF");
    }

    @Override
    public void trabalha() {
        System.out.println("Está trabalhando");
    }

    @Override
    public void ensina() {
        System.out.println("Está ensinando");
    }

    @Override
    public void vota() {
        System.out.println("Esta pessoa votou");
    }

    @Override
    public void getRg() {
        System.out.println("Este é o RG");
    }
}
