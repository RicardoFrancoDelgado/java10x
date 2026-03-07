package NivelIntermediario.construtores;

public class Main {
    public static void main(String[] args) {
        Hokage Minato = new Hokage("Minato Namikaze", "Aldeia da Folha", 32, false, 60, 1.78, 2000.00);
        System.out.println(Minato.nome);
        System.out.println(Minato.aldeia);
        System.out.println(Minato.missoes);
    }
}
