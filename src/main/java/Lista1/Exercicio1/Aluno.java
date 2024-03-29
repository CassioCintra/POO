package Lista1.Exercicio1;

public class Aluno {
    public int numeroAluno;
    public String nomeAluno;
    public int idade;
    public float p1;
    public float p2;
    public Aluno(int numeroAluno, String nomeAluno, int idade, int p1, int p2) {
        this.numeroAluno = numeroAluno;
        this.nomeAluno = nomeAluno;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }
    public double notaFinal(){
        return (this.p1 + this.p2)/2;
    }
    public int getNumeroAluno() {
        return numeroAluno;
    }
    public int getIdade() {
        return idade;
    }
    public String getNomeAluno() {
        return nomeAluno;
    }
    public String passou(double notaFinal){
        if(notaFinal >= 6){
            return "Passou";
        }
        else{
            return "Não passou";
        }
    }
    public void mostra(){
        System.out.println("Número do Aluno: " + this.getNumeroAluno() +
                "\nNome do Aluno: " + this.getNomeAluno() +
                "\nIdade: " + this.getIdade() +
                "\nNota final: " + this.notaFinal() +
                "\nAluno Aprovado/Reprovado: " + this.passou(this.notaFinal()));
    }
}
