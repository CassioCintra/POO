package Aulas;
public class Carro {
    public String marca;
    public String modelo;
    public int ano;
    public String cor;
    // true -> motor ligado
    // false -> motor desligado
    public boolean motor;
    public float velAtual;
    public Carro(String marca, String modelo, int ano, String cor, boolean motor, float velAtual){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.motor = motor;
        this.velAtual = velAtual;
    }
    public void acelerar(float x){
        if(this.motor){
            this.velAtual = this.velAtual + x;
        }
        System.out.println(this.ano + " " + this.cor +
                " Carro acelerando...");
    }
    public void frear(float x){
        if(this.motor){
            if(this.velAtual - x >= 0) {
                this.velAtual = this.velAtual - x;
            }
        }
        System.out.println(this.ano + " " + this.cor + " Carro frenando...");
    }
    public void ligar(){
        if(!this.motor){
            this.motor = true;
        }
    }
    public void desligar(){
        if(this.motor){
            this.motor = false;
        }
    }
    public void mostra(){
        System.out.println("Marca: " + this.marca +
                "\nModelo: " + this.modelo + "\nAno: " + this.ano +
                "\nCor: " + this.cor + "\nMotor: " +this.motor +
                "\nVelocidade Atual: " + this.velAtual);
    }
}
