package NivelBasico.Arrays;

public class Array2D {
    public static void main(String[] args) {
        String[][] ninjaEVila = new String[3][3];

        // Primeiro
        ninjaEVila[0][0] = "Folha";
        ninjaEVila[0][1] = "Naruto";
        ninjaEVila[0][2] = "Sasuke";

        // Segundo
        ninjaEVila[1][0] = "Nevoa";
        ninjaEVila[1][1] = "Zabuza";
        ninjaEVila[1][2] = "Haku";

        // Terceiro
        ninjaEVila[2][0] = "Deserto";
        ninjaEVila[2][1] = "Gaara";
        ninjaEVila[2][2] = "Temari";

        for (int i = 0; i < ninjaEVila.length; i++) {
            System.out.println("Vila: " + ninjaEVila[i][0] + " | Ninja 1: " + ninjaEVila[i][1] + " | Ninja 2: " + ninjaEVila[i][2]);
        }
    }
}
