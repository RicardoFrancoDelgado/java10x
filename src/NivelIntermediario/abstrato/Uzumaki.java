package NivelIntermediario.abstrato;

public class Uzumaki extends Ninja{

    public Uzumaki() {
        super();
    }

    public Uzumaki(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void tecnicaJutsu() {
        System.out.println("Eu sou " + nome + " e minha técnica é jutsu de clones");
    }
}
