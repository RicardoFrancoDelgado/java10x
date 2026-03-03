package NivelBasico.Condicoes;

public class LacoDeRepeticao {
    public static void main(String[] args) {
        /**
         * Lacos de repetição - repetem até atingir o parametro desejado
         * while
         * for
         */

        //While
        //Condicao (condicao == true) {tudo vai acontecer}
        int numeroDeClones = 0;
        int capacidadeDeClones = 40;

        while (numeroDeClones <= capacidadeDeClones) {
            numeroDeClones++; // incremento
            System.out.println(" O Naruto fez um clone das sombras");
        }

        //For
        for (int i = 0; i <= capacidadeDeClones; i++) {
            System.out.println("O Naruto se clonou " + i + " vezes");
        }
    }
}
