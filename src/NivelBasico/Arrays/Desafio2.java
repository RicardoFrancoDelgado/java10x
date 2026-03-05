package NivelBasico.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        // Cadastrar ninjas (com menu de opção)
        Scanner scanner = new Scanner(System.in);

        // ARRAY DE NINJAS
        int NUMERO_MAX = 10;
        String[] ninjas = new String[NUMERO_MAX];

        // variaveis de controle
        int ninjasCadastrados = 0;
        int opcao = 0;

        // DISPLAY PRO USUÁRIO
        while (opcao != 4) {
            // MENU
            System.out.println("\n====== Cadastro de Ninjas ======");
            System.out.println("1. Cadastrar um ninja");
            System.out.println("2. Listar um ninja");
            System.out.println("3. Deletar um ninja");
            System.out.println("4. Sair");
            System.out.print("Informa uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao) {
                case 1:
                    if (ninjasCadastrados < NUMERO_MAX) {
                        System.out.println("Informe o nome do ninja:");
                        String nomeNinja = scanner.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso!");
                    } else {
                        System.out.println("Limite de ninjas cadastrados");
                    }
                    break;
                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja cadastrado");
                    } else {
                        System.out.println("\n========= Lista de Ninjas =========");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Qual ninja deseja excluir ?");
                    for (int i = 0; i < ninjas.length; i++) {
                        System.out.println(i + ". " + ninjas[i]);
                    }
                    System.out.println("Informe o número do ninja para excluir: ");
                    int excluirNinja = scanner.nextInt();

                    if (ninjas[excluirNinja] != null) {
                        ninjas[excluirNinja] = null;
                        System.out.println("Ninja excluida com sucesso!");
                    } else {
                        System.out.println("Não tem nenhum ninja para excluir");
                    }
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
