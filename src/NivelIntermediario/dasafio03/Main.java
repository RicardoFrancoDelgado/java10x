package NivelIntermediario.dasafio03;

public class Main {
    public static void main(String[] args) {
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 17;
        Sasuke.missao = "Acompanhar ninjas em missão";
        Sasuke.nivelDificuldade = "E";
        Sasuke.statusMissao = "Em andamento";
        Sasuke.habilidadeEspecial = "Jutsu Bola de Fogo";
        String informacoes = Sasuke.mostrarInformacoes();
        System.out.println(informacoes);
        Sasuke.mostrarHabilidadeEspecial();
    }
}
