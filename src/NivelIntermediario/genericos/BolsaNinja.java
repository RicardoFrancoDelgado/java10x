package NivelIntermediario.genericos;


import java.util.ArrayList;
import java.util.List;

// Colocar um <T> ao lado da classe torna essa classe apta para receber um generic
public class BolsaNinja<T> {
    // A estrutura que vai permitir armazenar qualquer tipo de equipamento na bolsa
    List<T> equipamentos;

    public BolsaNinja() {
        equipamentos = new ArrayList<>();
    }

    // method para adicionar equipamentos na bolsa
    public void adicionarEquipamento(T equipamento) {
        equipamentos.add(equipamento);
    }

    // exibir os equipamentos adicionados
    public void mostrarEquipamentos() {
        for (T equipamento : equipamentos) {
            System.out.println(equipamento);
        }
    }
}
