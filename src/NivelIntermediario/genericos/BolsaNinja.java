package NivelIntermediario.genericos;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {
    private List<T> equipamentos;

    // O construtor instancia uma lista vazia de equipamentos
    public BolsaNinja() {
        this.equipamentos = new ArrayList<>();
    }

    // adicionar equipamentos na lista
    public void adicionarEquipamentos(T equipamento) {
        equipamentos.add(equipamento);
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public String toString() {
        return "Bolsa de equipamentos: " + equipamentos.toString();
    }
}
