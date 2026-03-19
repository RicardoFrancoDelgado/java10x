package NivelIntermediario.genericos;

public class AcompanhanteNinja {
    private String nomeAcompanhante;

    public AcompanhanteNinja(String nomeAcompanhante) {
        this.nomeAcompanhante = nomeAcompanhante;
    }

    public String getNomeAcompanhante() {
        return nomeAcompanhante;
    }

    public void setNomeAcompanhante(String nomeAcompanhante) {
        this.nomeAcompanhante = nomeAcompanhante;
    }

    @Override
    public String toString() {
        return "Nome do acompanhante ninja: " + nomeAcompanhante;
    }
}

