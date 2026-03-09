package NivelIntermediario.abstrato;

public class Main {
    public static void main(String[] args) {
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto";
        System.out.println(Naruto.nome);
        Naruto.jogarKunai();

        Naruto.fazerClone();
    }
}
