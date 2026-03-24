package NivelIntermediario.pilha;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // array
        // trabalha com ref de memória e é acessada por index para atribuição
        String[] ninjaArray = new String[3];
        ninjaArray[1] = "Naruto";

        // list
        // aumenta e diminui dinamicamente conforme necessidade
        List<String> ninjaList = new ArrayList<>();
        ninjaList.add("Sasuke Uchiha");

        // pilha (stack)
        // é trabalhada de forma vertical (LIFO)
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.push("Sakura");
        ninjaStack.push("Sasuke");
        ninjaStack.push("Naruto");
        ninjaStack.push("Kakashi");
        System.out.println("Ninja Stack: " + ninjaStack);
        System.out.println("Ninja Stack: " +  ninjaStack.peek());
        ninjaStack.pop(); // remove o que está no topo da pilha
        System.out.println("Ninja Stack: " + ninjaStack); // último a entrar - primeiro a sair
        System.out.println("Ninja Stack: " + ninjaStack.peek()); // topo da pilha
        System.out.println("Ninja Stack: " + ninjaStack.size() + " elementos");

    }
}
