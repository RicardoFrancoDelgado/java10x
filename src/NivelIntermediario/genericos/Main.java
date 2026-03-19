package NivelIntermediario.genericos;

public class Main {
    public static void main(String[] args) {
        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.adicionarEquipamento(new Kunai("Kunai de fogo"));
        bolsaNinja.adicionarEquipamento(new Pergaminho("Invocação do Sapo"));
        bolsaNinja.adicionarEquipamento(new Shuriken(4));
        bolsaNinja.adicionarEquipamento(new AcompanhanteNinja("SenjuMaru"));

        bolsaNinja.mostrarEquipamentos();
    }
}
