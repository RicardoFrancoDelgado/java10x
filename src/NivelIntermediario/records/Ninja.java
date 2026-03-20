package NivelIntermediario.records;

import java.util.Objects;

public class Ninja {
    private final String nome;
    private final String aldeia;
    private final int idade;

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ninja ninja = (Ninja) o;
        return idade == ninja.idade && Objects.equals(nome, ninja.nome) && Objects.equals(aldeia, ninja.aldeia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, aldeia, idade);
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", aldeia='" + aldeia + '\'' +
                ", idade=" + idade +
                '}';
    }
}
