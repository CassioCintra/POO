package Lista1.Exercicio1;

public class TestaAluno {
    public static void main(String[] args){
        Aluno aluno = new Aluno(001,"Jubileu", 18, 8, 9);

        aluno.passou(aluno.notaFinal());
        aluno.getNumeroAluno();
        aluno.getNomeAluno();
        aluno.getIdade();
        aluno.mostra();
    }
}