package NivelIntermediario.encapsulamento;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------Uzumaki-----------------");

        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 16, 20, 1.75);
        System.out.println("Ninja: " + naruto.getNome());
        System.out.println("Aldeia: " + naruto.getAldeia());
        System.out.println("Idade: " + naruto.getIdade());
        System.out.println("Número de missões: " +  naruto.getNumeroDeMissoesConcluidas());
        System.out.println("Altura: " + naruto.getAltura());

        naruto.setIdade(18);
        System.out.println("Nova idade: " +  naruto.getIdade());

        System.out.println("-----------------Uchiha-----------------");



    }
}
