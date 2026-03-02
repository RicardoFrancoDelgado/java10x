package TiposDeDados;

public class Desafio1 {
    public static void main(String[] args) {
        // Ninja 1
        String nome = "Naruto Uzumaki";
        int idade = 14;
        String missao = "Cobrir a vila";
        char dificuldade = 'B';
        String status;

        if (idade < 15) {
            if (dificuldade == 'C' || dificuldade == 'D') {
                status = "CONCLUIDO";
            } else {
                status = "NAO CONCLUIDO";
            }
        } else {
            status = "CONCLUIDO";
        }

        // Exibir no console
        System.out.println("-----------------------------------------");
        System.out.println("Nome do ninja: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Dificuldade: " + dificuldade);
        System.out.println("Status: " + status);

        // Ninja 2
        String nome2 = "Sasuke Uchiha";
        int idade2 = 15;
        String missao2 = "Acompanhar ninjas";
        char dificuldade2 = 'A';
        String status2;

        if (idade2 < 15) {
            if (dificuldade2 == 'C' || dificuldade2 == 'D') {
                status2 = "CONCLUIDO";
            } else {
                status2 = "NAO CONCLUIDO";
            }
        } else {
            status2 = "CONCLUIDO";
        }

        System.out.println("-----------------------------------------");
        System.out.println("Nome do ninja: " + nome2);
        System.out.println("Idade: " + idade2);
        System.out.println("Missão: " + missao2);
        System.out.println("Dificuldade: " + dificuldade2);
        System.out.println("Status: " + status2);

        // Ninja 3
        String nome3 = "Sakura Haruno";
        int idade3 = 14;
        String missao3 = "Curar feridos de guerra";
        char dificuldade3 = 'C';
        String status3;

        if (idade3 < 15) {
            if (dificuldade3 == 'C' || dificuldade3 == 'D') {
                status3 = "CONCLUIDO";
            } else {
                status3 = "NAO CONCLUIDO";
            }
        } else {
            status3 = "CONCLUIDO";
        }

        System.out.println("-----------------------------------------");
        System.out.println("Nome do ninja: " + nome3);
        System.out.println("Idade: " + idade3);
        System.out.println("Missão: " + missao3);
        System.out.println("Dificuldade: " + dificuldade3);
        System.out.println("Status: " + status3);


    }
}
