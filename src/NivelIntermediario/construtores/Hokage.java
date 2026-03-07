package NivelIntermediario.construtores;

public class Hokage {
    String nome;
    String aldeia;
    int idade;
    boolean vivoOuMorto;
    int missoes;
    double altura;
    double saldoBancario;

    // non args constructor -> construtor com nenhum argumento (vem padrão)
    public Hokage() {
    }

    // construtores isolados -> recebendo um ou outros atributos
    public Hokage(String nome, String aldeia) {
        this.nome = nome;
        this.aldeia = aldeia;
    }

    // all args constructor -> construtor com todos os argumentos
    public Hokage(String nome, String aldeia, int idade, boolean vivoOuMorto, int missoes, double altura, double saldoBancario) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.vivoOuMorto = vivoOuMorto;
        this.missoes = missoes;
        this.altura = altura;
        this.saldoBancario = saldoBancario;
    }
}
