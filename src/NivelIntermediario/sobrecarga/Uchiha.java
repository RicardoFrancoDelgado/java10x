package NivelIntermediario.sobrecarga;

public class Uchiha extends Ninja implements EstrategiaNinja{

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
        System.out.println("Meu nome é: " + nome + " e essa é minha técnica uchiha: " + tecnica);
    }

    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Essa é a minha estratégia de batalha");
    }

    @Override
    public void estrategiaDeBatalha(int qi) {
        if (qi > 150) {
            System.out.println("Ninja: " + nome + " | QI: " + qi + " | Status: GÊNIO");
        } else if (qi >= 120) {
            System.out.println("Ninja: " + nome + " | QI: " + qi + " | Status: PROMISSOR");
        } else {
            System.out.println("Ninja: " + nome + " | QI: " + qi + " | Status: EM DESENVOLVIMENTO");
        }

    }
}
