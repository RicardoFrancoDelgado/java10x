package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {
        /*
        * Objetivo: Permitir que o usuário escolha um ninja
        *
         */
        Scanner scanner = new Scanner(System.in);

        // Mostrar opções para o usuário
        System.out.println("Escolha um ninja:");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        // receber a entrada do usuário
        int escolhaDoUsuario = scanner.nextInt();

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("Ninja escolhido: Naruto Uzumaki, o próximo hokage");
                break;
            case 2:
                System.out.println("Ninja escolhido: Sasuke Uchiha, o cara mais chato");
                break;
            case 3:
                System.out.println("Ninja escolhido: Sakura Haruno, a mulher do bagulho");
                break;
            default:
                System.out.println("Resposta inválida tente denovo");
                break;
        }

        scanner.close();
    }
}
