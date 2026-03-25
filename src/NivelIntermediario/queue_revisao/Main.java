package NivelIntermediario.queue_revisao;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Criar uma Queue
        Queue<String> pacientes = new LinkedList<>();

        // Criar um fluxo onde o paciente chegue fique marcado como encaixe e seja atendido
        // Isso faz com que o paciente sendo o primeiro a chegar ele vai ser o primeiro a sair também
        // e assim ser o primeiro a ser atendido.

        pacientes.add("Ricardo");
        pacientes.add("Fábio");
        pacientes.add("Raphael");
        pacientes.add("Júlia");
        pacientes.add("Diana");

        System.out.println("Lista de Pacientes - Por ordem de chegada");
        for (String paciente : pacientes) {
            System.out.println("Paciente: " + paciente);
        }

        // Simular um atendimento necessitária realizar um poll() -> que é chamar o método de retirar o HEAD
        System.out.println("Atendendo paciente na ordem: " + pacientes.poll());

        System.out.println("Lista de Pacientes - Atualizada os que faltam atender");
        for (String paciente : pacientes) {
            System.out.println("Paciente: " + paciente);
        }

        System.out.println("Próximo paciente a ser atendido: " + pacientes.peek());
    }
}
