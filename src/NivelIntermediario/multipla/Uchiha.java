package NivelIntermediario.multipla;

public class Uchiha extends Ninja implements SharinganInterface{

    public Uchiha() {
    }

    public Uchiha(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }


    @Override
    public void ativarSharingan() {
        System.out.println(nome + ": ativou o sharingan");
    }
}
