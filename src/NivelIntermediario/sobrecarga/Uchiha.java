package NivelIntermediario.sobrecarga;

public class Uchiha extends Ninja{

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
}
