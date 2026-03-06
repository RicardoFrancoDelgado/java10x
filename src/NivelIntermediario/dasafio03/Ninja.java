package NivelIntermediario.dasafio03;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public String mostrarInformacoes() {
        return "Nome do ninja: " + nome
                + "\nIdade: " + idade
                + "\nMissão: " + missao
                + "\nNivel dificuldade: " + nivelDificuldade
                + "\nStatus: " + statusMissao;
    }
}
