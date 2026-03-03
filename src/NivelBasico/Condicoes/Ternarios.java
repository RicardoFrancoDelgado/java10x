package NivelBasico.Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /**
         * Maneiras de reduzir o código - funciona como o if e else
         * variavel = condicao ? valorTrue : valorFalse
         */

        short numeroMissoes = 11;
        String nivel = (numeroMissoes >= 10)
                ? "Esse ninja está com mais de 10 missões"
                : "Esse ninja tem menos de 10 missões";
        System.out.println(nivel);

    }
}
