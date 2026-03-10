package NivelIntermediario.multipla;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface{
    public Hatake() {
    }

    public Hatake(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    @Override
    public void ativarSharingan() {
        System.out.println(nome+": Sharingan ativado");
    }

    @Override
    public void anbuMensagem() {
        System.out.println(nome+ ": faz parte da Anbu");
    }
}
