package NivelIntermediario.datastruct;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Listas
        List<String> ninjaList = new ArrayList<>();
        ninjaList.add("Ninja 1");
        System.out.println("Ninja List " + ninjaList); // List -> já possui o toString()

        // Stack (Pilha)
        // Segue o padrão (FiLo) First in Last out
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.push("Ninja 1");
        ninjaStack.push("Ninja 2");
        System.out.println("Ninja Stack (Pilha): " +  ninjaStack);
        System.out.println("HEAD: " + ninjaStack.peek()); // retorna o item que é o head da estrutura
        ninjaStack.push("Ninja 3");
        System.out.println("Ninja Stack (Pilha): " +  ninjaStack);
        ninjaStack.pop();
        System.out.println("Ninja Stack (Pilha): " +  ninjaStack);

        // Queue
        // Segue o padrão (FiFo) First in First out
        // ao remover elementos removemos sempre um HEAD e assim passando para outro elemento
        // a alcunha de ser um HEAD
        Queue<String> ninjaQueue = new LinkedList<>();
        ninjaQueue.add("Ninja 1");
        ninjaQueue.add("Ninja 2");
        ninjaQueue.add("Ninja 3");
        System.out.println("Ninja Queue (Fila): " +  ninjaQueue);
        System.out.println("HEAD (Fila): " + ninjaQueue.peek());
        ninjaQueue.poll();
        System.out.println("Ninja Queue (Fila): " + ninjaQueue);

    }
}
