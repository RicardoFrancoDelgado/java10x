package NivelIntermediario.heranca;

public class Boruto extends Uzumaki implements HyugaUzumaki {
    /**
     * A Classe que extends uma sub classe que extends ao molde de ninja também tem acesso
     * aos métodos e atributos
     *
     * Mas por ser uma classe que implementa uma interface ela precisa cumprir o contrato de
     * implementar os seus métodos
     */

    public void AtivarKarma() {
        System.out.println("Eu sou " + nome + " e ativei o Karma, sou um Hyuga Uzumaki");
    }

    public void AtivarJougan() {
        System.out.println("Eu sou " + nome + " e ativei o Jougan, sou um Hyuga Uzumaki");
    }

}
