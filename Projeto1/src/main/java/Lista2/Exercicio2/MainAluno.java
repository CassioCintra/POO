package Lista2.Exercicio2;

import Lista2.Exercicio2.model.Aluno;
public class MainAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNumeroAluno("000001");
        aluno.setNome("Jubileu");
        aluno.setIdade(18);
        aluno.setP1(9);
        aluno.setP2(10);

        aluno.notaFinal();
        aluno.dadosAluno();
    }
}
