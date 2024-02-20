package Aulas;
public class Carro {
    public String marca;
    public String modelo;
    public int ano;
    public String cor;
    public Carro(String marca, String modelo, int ano, String cor){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }
    public void acelerar(){
        System.out.println("Carro acelerando...");
    }
    public void frear(){
        System.out.println("Carro frenando...");
    }
}
