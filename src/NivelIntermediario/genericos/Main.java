package NivelIntermediario.genericos;

public class Main {
    public static void main(String[] args) {
        Equipamento kunai = new Equipamento("Kunai de ferro");
        Equipamento shuriken = new Equipamento("Shukiren");
        Equipamento pergaminho = new Equipamento("Pergaminho");

        BolsaEquipamentos<Equipamento> bolsaDeEquipamentos = new BolsaEquipamentos<>();
        bolsaDeEquipamentos.adicionarEquipamento(kunai);
        bolsaDeEquipamentos.adicionarEquipamento(shuriken);
        bolsaDeEquipamentos.adicionarEquipamento(pergaminho);

        System.out.println(bolsaDeEquipamentos);
    }
}
