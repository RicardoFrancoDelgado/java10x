package NivelIntermediario.construtores;

public class Senju extends Hokage{
    // fazer os construtores da classe abstrata na classe que herda
    public Senju(String nome, String aldeia, int idade, boolean vivoOuMorto, int missoes, double altura, double saldoBancario) {
        super(nome, aldeia, idade, vivoOuMorto, missoes, altura, saldoBancario);
    }

    @Override
    public void sabedoriaHokage() {
        System.out.println(nome + " adquiriu a sabedoria hokage");
    }
}
