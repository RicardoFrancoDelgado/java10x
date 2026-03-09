package NivelIntermediario.abstrato;

// para proteger uma classe de ser instanciada (abstract)

public abstract class Ninja implements JutsuHabilidades{
    String nome;
    int idade;

    @Override
    public void tecnicaJutsu(){
        System.out.println("Habilidade ninja jutsu");
    }
}
