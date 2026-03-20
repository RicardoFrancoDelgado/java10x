package NivelIntermediario.records;

public class Main {
    public static void main(String[] args) {
        Ninja naruto = new Ninja("Naruto", "Aldeia da folha", 17);
        System.out.println(naruto);

        NinjaRecord sasuke = new NinjaRecord("Sasuke", "Aldeia da folha", 18);
        System.out.println(sasuke);
    }
}
