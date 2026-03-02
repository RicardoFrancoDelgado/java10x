package TiposDeDados;

public class Desafio1 {
    public static void main(String[] args) {
        String nomeNinja1 = "Naruto Uzumaki";
        int idadeNinja1 = 16;
        String missaoNinja1 = "Pular de galho em galho";
        char dificuldadeNinja1 = 'A';
        String statusNinja1;

        if (idadeNinja1 < 15) {
            if (dificuldadeNinja1 == 'C' || dificuldadeNinja1 == 'D') {
                statusNinja1 = "CONCLUIDA";
            } else {
                statusNinja1 = "NÃO CONCLUIDA";
            }
        } else {
            statusNinja1 = "CONCLUIDA";
        }

        System.out.println("========================================");
        System.out.println("Nome: " + nomeNinja1);
        System.out.println("Idade: " + idadeNinja1);
        System.out.println("Missao: " + missaoNinja1);
        System.out.println("Dificuldade: " + dificuldadeNinja1);
        System.out.println("Status: " + statusNinja1);

        String nomeNinja2 = "Sasuke Uchiha";
        int idadeNinja2 = 16;
        String missaoNinja2 = "Matar o irmão";
        char dificuldadeNinja2 = 'S';
        String statusNinja2 = "Em andamento";

        if (idadeNinja2 < 15) {
            if (dificuldadeNinja1 == 'C' || dificuldadeNinja1 == 'D') {
                statusNinja2 = "CONCLUIDA";
            } else {
                statusNinja2 = "NÃO CONCLUIDA";
            }
        } else {
            statusNinja2 = "CONCLUIDA";
        }

        System.out.println("========================================");
        System.out.println("Nome: " + nomeNinja2);
        System.out.println("Idade: " + idadeNinja2);
        System.out.println("Missao: " + missaoNinja2);
        System.out.println("Dificuldade: " + dificuldadeNinja2);
        System.out.println("Status: " + statusNinja2);
        System.out.println("========================================");

        String nomeNinja3 = "Sakura Haruno";
        int idadeNinja3 = 14;
        String missaoNinja3 = "Curar todo mundo";
        char dificuldadeNinja3 = 'D';
        String statusNinja3 = "Concluido";

        if (idadeNinja3 < 15) {
            if (dificuldadeNinja1 == 'C' || dificuldadeNinja1 == 'D') {
                statusNinja3 = "CONCLUIDA";
            } else {
                statusNinja3 = "NÃO CONCLUIDA";
            }
        } else {
            statusNinja3 = "CONCLUIDA";
        }

        System.out.println("Nome: " + nomeNinja3);
        System.out.println("Idade: " + idadeNinja3);
        System.out.println("Missao: " + missaoNinja3);
        System.out.println("Dificuldade: " + dificuldadeNinja3);
        System.out.println("Status: " + statusNinja3);

    }
}
