package Lista5.Exercicio1;

public class TestaPessoaCidade {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Cidade cidade = new Cidade();

        cidade.contrata(pessoa);
        cidade.contrata((Empregado) pessoa);
        cidade.cobraDe(pessoa);
        cidade.registra(pessoa);
        cidade.alimenta(pessoa);
    }
}
