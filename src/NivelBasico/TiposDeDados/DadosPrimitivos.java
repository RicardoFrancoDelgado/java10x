package NivelBasico.TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {
        /*
         * Dados primitivos - int, double, float, char, boolean, short.
         * Objetivo - Criar um ninja - Naruto -
         */

        int idade = 16; // int valor máximo - 2147483647
        double altura = 1.65;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        Long saldoBancario = 2147483648L; // Long valor máximo - 9,223,372,036,854,775,807

        System.out.println(idade);
        System.out.println(saldoBancario);
        System.out.println(altura);

        System.out.println("Saldo bancário é = " + saldoBancario);
        System.out.println("Minha idade é = " + idade);
    }
}
