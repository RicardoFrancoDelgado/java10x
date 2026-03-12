package NivelIntermediario.sobrecarga;

public class Main {
    public static void main(String[] args) {
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18, 20, NivelNinja.GENIN, "Justsu Bola de Fogo");
        sasuke.jutsuUchiha();

        sasuke.estrategiaDeBatalha();
        sasuke.estrategiaDeBatalha(100);

        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da Folha", 48, 900, NivelNinja.KAGE, "Mil cortes");
        madara.jutsuUchiha();

        madara.estrategiaDeBatalha(190);
    }
}
