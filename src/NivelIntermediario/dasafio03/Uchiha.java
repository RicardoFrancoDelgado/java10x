package NivelIntermediario.dasafio03;

public class Uchiha extends Ninja{

    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial(){
        System.out.println("Habilidade especial: " + habilidadeEspecial);
    }

    @Override
    public String mostrarInformacoes() {
        return "Nome do ninja: " + nome
                + "\nIdade: " + idade
                + "\nMissão: " + missao
                + "\nNivel dificuldade: " + nivelDificuldade
                + "\nStatus: " + statusMissao;
    }
}
