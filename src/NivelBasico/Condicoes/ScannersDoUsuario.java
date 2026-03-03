package NivelBasico.Condicoes;

import java.util.Scanner;

public class ScannersDoUsuario {

    public static void main(String[] args) {
        /*
         * Scanner = caixa onde o usuário coloca informação;
         * Uma forma de trazer o usuário para dentro da aplicação
         * Objetivo - o usuário vai criar um ninja e vamos validar os dados;
         */

        Scanner caixaDeTexto = new Scanner(System.in);

        // Receber o nome do ninja
        System.out.println("Escreva o nome do ninja:");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);

        // Receber a idade do ninja
        System.out.println("Escreva a idade do ninja:");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é: " + idadeDoNinja + " anos");

        // Tratamento de dados
        if (idadeDoNinja >= 18) {
            System.out.println("Este ninja é maior de idade");
        } else {
            System.out.println("Este ninja é menor de idade");
        }

        // Fechar o scanner sempre
        caixaDeTexto.close();

    }

}
