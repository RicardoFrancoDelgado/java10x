package NivelIntermediario.abstrato;

public class Uchiha extends Ninja {

    public Uchiha(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public void tecnicaJutsu() {
        System.out.println("Eu sou " + nome + " e minha técnica é jutsu bola de fogo");
    }
}
