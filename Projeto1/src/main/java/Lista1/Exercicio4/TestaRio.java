package Lista1.Exercicio4;

public class TestaRio {
    public static void main(String[] args) {
        Rio rio1 = new Rio("Rio sem nome", 8, false);
        Rio rio2 = new Rio("Rio com nome", 4,true);

        rio1.mostrar();
        rio1.chover(3);
        rio1.ensolarar(6);
        rio1.sujar();
        rio1.mostrar();

        rio2.mostrar();
        rio2.chover(5);
        rio2.ensolarar(4.56F);
        rio2.limpar();
        rio2.mostrar();
    }
}
