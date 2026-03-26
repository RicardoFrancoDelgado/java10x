package NivelIntermediario.desafio06;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ListaNinja<Ninja> listaNinja = new ListaNinja<>();

        listaNinja.addNinja(new Ninja("Naruto", 19, "Konoha"));
        listaNinja.addNinja(new Ninja("Sasuke", 19, "Konoha"));
        listaNinja.addNinja(new Ninja("Sakura", 18, "Konoha"));
        listaNinja.addNinja(new Ninja("Hinata", 18, "Konoha"));
        listaNinja.addNinja(new Ninja("Kakashi", 45, "Konoha"));
        listaNinja.addNinja(new Ninja("Tobirama", 56, "Konoha"));
        listaNinja.addNinja(new Ninja("Zabuza", 34, "Névoa"));

        // Exibir os ninjas
        System.out.println("====================NINJAS INSTANCIADOS====================");
        listaNinja.exibirNinja(); // Complexidade O(n)

        // adicionar no início
        listaNinja.addNinjaFirst(new Ninja("Gabiramu", 20, "Penha"));
        System.out.println("====================NINJA ADICIONADO====================");
        listaNinja.exibirNinja(); // Complexidade O(n)

        // remover no inicio
        System.out.println("====================NINJA REMOVIDO====================");
        Ninja removido = listaNinja.removeNinjaFirst();
        System.out.println("Ninja removido: " + removido);

        // Exibir lista atualizada de ninjas
        System.out.println("====================NINJAS ATUALIZADOS====================");
        listaNinja.exibirNinja();

        // Buscar ninja por index
        System.out.println("====================BUSCAR NINJA====================");
        Ninja terceiro = listaNinja.getNinja(3);
        System.out.println(terceiro);

    }
}
