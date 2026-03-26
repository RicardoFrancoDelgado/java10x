package NivelIntermediario.desafio06;

import java.util.LinkedList;

public class ListaNinja<T> {
    LinkedList<T> lista;

    public ListaNinja() {
        lista = new LinkedList<>();
    }

    public void addNinja(T ninja) {
        lista.add(ninja);
    }

    public void addNinjaFirst(T ninja) {
        lista.addFirst(ninja);
    }

    public T removeNinjaFirst() {
        return lista.removeFirst();
    }

    public T getNinja(int index) {
        return lista.get(index);
    }


    public void exibirNinja() {
        for (T ninja : lista) {
            System.out.println(ninja);
        }
    }
}
