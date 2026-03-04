package NivelBasico.Arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // O garbage colector fica responsável por tirar o array antigo da memória
        String[] nomes = new String[6];
        nomes[0] = "Naruto Uzumaki";
        nomes[1] = "Sasuke Uchiha";
        nomes[2] = "Sakura Haruno";

        nomes = new String[6];
        nomes[0] = "Tobirama";
        nomes[1] = "Sasuke";
        nomes[2] = "Sakura Haruno";
        nomes[3] = "Satoro Gojo";
        nomes[4] = "Kento Nanami";
        nomes[5] = "Sukuna Hyumen";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        System.out.println(nomes[0]);

        System.out.println(nomes[5]);

        int[] idade = new int[2];
        idade[0] = 16;
        System.out.println(idade[1]);

        boolean[] verdadeiroOuFalso = new boolean[2];
        System.out.println(verdadeiroOuFalso[0]);

        double[] flutuante = new double[2];
        System.out.println(flutuante[0]);

        char[] caracteres = new char[2];
        System.out.println(caracteres[0]);

        Integer[] num = new Integer[2];
        System.out.println(num[0]);
    }
}
