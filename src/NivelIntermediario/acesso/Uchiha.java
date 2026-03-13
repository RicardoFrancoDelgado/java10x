package NivelIntermediario.acesso;

public class Uchiha extends Ninja implements EstrategiaNinja {

    //TODO: Construtores padrão

    public Uchiha() {
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int missoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, missoesConcluidas, rank);
    }

    public Uchiha(String nome, String aldeia, int idade, int missoesConcluidas, NivelNinja rank, String tecnica) {
        super(nome, aldeia, idade, missoesConcluidas, rank, tecnica);
    }



    public void jutsuUchiha() {
        System.out.println("Meu nome é: " + getNome() + " e essa é minha técnica uchiha: " + getTecnica());
    }

    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Essa é a minha estratégia de batalha");
    }

    @Override
    public void estrategiaDeBatalha(int qi) {
        if (qi > 150) {
            System.out.println("Ninja: " + getNome() + " | QI: " + qi + " | Status: GÊNIO");
        } else if (qi >= 120) {
            System.out.println("Ninja: " + getNome() + " | QI: " + qi + " | Status: PROMISSOR");
        } else {
            System.out.println("Ninja: " + getNome() + " | QI: " + qi + " | Status: EM DESENVOLVIMENTO");
        }

    }

    // não é possível sobrescrever métodos final
//    @Override
//    public final void jogarKunai() {
//        System.out.println(nome + " jogou a Kunai");
//    }

    @Override
    public String toString() {
        return "Uchiha{" +
                "nome='" + getNome() + '\'' +
                ", aldeia='" + getAldeia() + '\'' +
                ", idade=" + getIdade() +
                ", missoesConcluidas=" + getMissoesConcluidas() +
                ", rank=" + getRank() +
                ", tecnica='" + getTecnica() + '\'' +
                '}';
    }
}
