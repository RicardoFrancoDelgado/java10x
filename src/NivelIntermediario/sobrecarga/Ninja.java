package NivelIntermediario.sobrecarga;

public class Ninja {
    String nome;
    String aldeia;
    int idade;
    int missoesConcluidas;
    NivelNinja rank;
    String tecnica;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public Ninja(String nome, String aldeia, int idade, int missoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.missoesConcluidas = missoesConcluidas;
        this.rank = rank;
    }

    public Ninja(String nome, String aldeia, int idade, int missoesConcluidas, NivelNinja rank, String tecnica) {
        this(nome, aldeia, idade,  missoesConcluidas, rank);
        this.tecnica = tecnica;
    }

    public final void jogarKunai() {
        System.out.println(nome + " jogou a Kunai");
    }
}
