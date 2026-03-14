package NivelIntermediario.enumerator;

public class Missoes {
    private String nome;
    private RankingMissoes rankingMissoes;

    public Missoes() {
    }

    public Missoes(String nome, RankingMissoes rankingMissoes) {
        this.nome = nome;
        this.rankingMissoes = rankingMissoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankingMissoes getRankingMissoes() {
        return rankingMissoes;
    }

    public void setRankingMissoes(RankingMissoes rankingMissoes) {
        this.rankingMissoes = rankingMissoes;
    }

    public void exibirInformacao() {
        System.out.println("Missão: " + getNome());
        System.out.println("Descrição: " + getRankingMissoes().getDescricao());
        System.out.println("Dificuldade: " + getRankingMissoes().getDificuldade());
    }
}
