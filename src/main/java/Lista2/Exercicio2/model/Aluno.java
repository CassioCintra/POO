package Lista2.Exercicio2.model;

public class Aluno {
    private int numeroAluno;
    private String nome;
    private int idade;
    private float p1;
    private float p2;
    public Aluno(){

    }

    public int getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(String numeroAluno) {
        if(numeroAluno.length() == 6){
            this.numeroAluno = Integer.parseInt(numeroAluno);
        }
        else {
            System.out.println("Número de Aluno inválido!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length() <= 30) {
            this.nome = nome;
        }
        else {
            System.out.println("Nome inválido!");
        }
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        this.p1 = p1;
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        this.p2 = p2;
    }

    public void notaFinal(){
        double notaFinal = (this.p1 + this.p2)/2;
        System.out.println("Nota Final = " + notaFinal + "\n");
    }

    public void dadosAluno(){
        System.out.println("Número do Aluno = " + this.numeroAluno +
                "\nNome do Aluno = " + this.nome +
                "\nIdade do Aluno = " + this.idade + "\n");
    }
}
