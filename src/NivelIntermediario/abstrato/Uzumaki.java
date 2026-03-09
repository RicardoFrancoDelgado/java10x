package NivelIntermediario.abstrato;

public class Uzumaki extends Ninja{

    // construtor
    public Uzumaki(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public void tecnicaJutsu() {
        System.out.println("Eu sou " + nome + " e minha técnica é jutsu de clones");
    }
}
