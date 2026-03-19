package NivelIntermediario.genericos;

public class Pergaminho {
    private String descricao;

    public Pergaminho(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Descrição do pergaminho: " + descricao;
    }
}
