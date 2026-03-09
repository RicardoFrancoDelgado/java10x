package NivelIntermediario.abstrato;

public class Uzumaki extends Ninja implements UzumakiInterface{

    @Override
    public void fazerClone() {
        System.out.println("Fiz um clone");
    }

    @Override
    public void jogarKunai() {
        System.out.println("Joguei uma kunai");
    }
}
