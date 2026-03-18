package NivelIntermediario.lista;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Relembrando arrays
        String[] ninjaList = new String[4];
        ninjaList[0] = "Naruto";
        ninjaList[1] = "Sasuke";
        ninjaList[2] = "Sakura";
        ninjaList[3] = "Kakashi";

        for (int i = 0; i < ninjaList.length; i++) {
            System.out.println("Ninja: " + ninjaList[i]);
        }

        // Instanciando arraylists
        List<String> listNinja = new ArrayList<>();
        listNinja.add("Naruto");
        listNinja.add("Sasuke");
        listNinja.add("Sakura");
        listNinja.add("Kakashi");
        System.out.println("Ninjas: " + listNinja);

        // adicionando elementos
        listNinja.add("Tobirama");
        System.out.println("Ninjas: " + listNinja);

        // removendo elementos
        listNinja.remove("Kakashi");
        System.out.println("Ninjas: " + listNinja);

        // alterando um item da lista
        listNinja.set(3, "Hashirama");
        System.out.println("Ninjas: " + listNinja);

        // verificando o tamanho da lista
        System.out.println("Tamanho: " + listNinja.size());
    }
}
