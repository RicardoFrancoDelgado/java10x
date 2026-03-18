package NivelIntermediario.genericos;

public class Main {
    public static void main(String[] args) {
        EquipamentoNinja kunai = new EquipamentoNinja("Kunai de ferro");
        EquipamentoNinja pergaminho = new EquipamentoNinja("Pergaminho");
        EquipamentoNinja shuriken = new EquipamentoNinja("Shuriken de fogo");

        BolsaNinja<EquipamentoNinja> bolsaDeEquipamentos = new BolsaNinja<>();
        bolsaDeEquipamentos.adicionarEquipamentos(kunai);
        bolsaDeEquipamentos.adicionarEquipamentos(pergaminho);
        bolsaDeEquipamentos.adicionarEquipamentos(shuriken);

        System.out.println(bolsaDeEquipamentos);
    }
}
