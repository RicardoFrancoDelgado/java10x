package NivelIntermediario.hashset;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> ninjas = new ArrayList<>(); // não remove duplicatas

        ninjas.add("Naruto");
        ninjas.add("Sasuke");
        ninjas.add("Sakura");
        ninjas.add("Naruto");
        ninjas.add("Amaterasu");
        ninjas.add("Boruto");

        System.out.println("Ninjas list = " + ninjas);

        Set<String> ninjasHashSet = new HashSet<>(); // hashset remove duplicatas
        Set<String> ninjasTreeSet = new TreeSet<>(); // tree remove duplicatas - colocando em ordem natural dos tipos
        Set<String> ninjasLinkedHashSet = new LinkedHashSet<>(); // hashset remove duplicatas - exibe em ordem de declaração

        ninjasHashSet.addAll(ninjas);
        ninjasTreeSet.addAll(ninjas);
        ninjasLinkedHashSet.addAll(ninjas);
        // remove sem indice -> remove por objeto literal

        System.out.println("Ninjas HashSet = " + ninjasHashSet); // não exibe em ordem
        System.out.println("Ninjas TreeSet = " + ninjasTreeSet); // não exibe em ordem
        System.out.println("Ninjas LinkedHashSet = " + ninjasLinkedHashSet); // não exibe em ordem


    }
}
