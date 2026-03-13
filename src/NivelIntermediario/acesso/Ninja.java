package NivelIntermediario.acesso;

public class Ninja {
    private String nome;
    private String aldeia;
    private int idade;
    private int missoesConcluidas;
    private NivelNinja rank;
    private String tecnica;

    // atributos final são declarados na instancia e não podem ser reatribuidos (são constantes)
//    final double altura = 2.10;
//    double altura = 1.90;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMissoesConcluidas() {
        return missoesConcluidas;
    }

    public void setMissoesConcluidas(int missoesConcluidas) {
        this.missoesConcluidas = missoesConcluidas;
    }

    public NivelNinja getRank() {
        return rank;
    }

    public void setRank(NivelNinja rank) {
        this.rank = rank;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public final void jogarKunai() {
        System.out.println(getNome() + " jogou a Kunai");
    }
}
