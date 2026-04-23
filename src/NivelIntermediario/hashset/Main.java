package NivelIntermediario.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> ninjas = new ArrayList<>(); // não remove duplicatas

        ninjas.add("Naruto");
        ninjas.add("Sasuke");
        ninjas.add("Sakura");
        ninjas.add("Naruto");

        System.out.println("Ninjas list = " + ninjas);

        Set<String> ninjasSet = new HashSet<>(); // remove duplicatas

        ninjasSet.addAll(ninjas);
        // remove sem indice -> remove por objeto literal

        System.out.println("Ninjas set = " + ninjasSet); // não exibe em ordem


    }
}
