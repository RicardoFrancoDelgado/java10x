package NivelIntermediario.enumerator;

public enum RankingMissoes {
    D("Fácil", 1),
    C("Considerável", 2),
    B("Mediano", 3),
    A("Difícil", 4),
    S("Pesadelo", 5);

    private String descricao;
    private int dificuldade;

    RankingMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
}
