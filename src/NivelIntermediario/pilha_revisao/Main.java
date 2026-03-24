package NivelIntermediario.pilha_revisao;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> sites = new Stack<>();
        sites.push("https://www.google.com.br");
        sites.push("https://www.youtube.com.br");
        sites.push("https://www.spotify.com.br");
        sites.push("https://www.instagram.com.br");
        sites.push("https://www.github.com.br");

//        System.out.println("Sites: " + sites);
        System.out.println("Pilha de sites antes de acessar o claude");

        for (String site : sites) {
            System.out.println(site);
        }

        // vamos simular que eu acessei um site -> push no stack de sites
        sites.push("https://claude.ai");

        System.out.println("Pilha de sites depois de acessar o claude");
        for (String site : sites) {
            System.out.println(site);
        }

        // e se quiser remover um site da pilha
        // tem que seguir o padrão lifo

        // se eu quiser verificar qual o atual head da pilha
        System.out.println("Atual HEAD da pilha: " + sites.peek());

        // o que significa que se eu usar um pop() e remover o HEAD meu head atual vai passar a ser o
        // https://github.com.br

        // removendo o HEAD
        System.out.println("HEAD removido: " + sites.pop());

        System.out.println("Atual HEAD da pilha: " + sites.peek()); //  verificando atual HEAD

        System.out.println("Tamanho da pilha de sites: " + sites.size());
    }

}
