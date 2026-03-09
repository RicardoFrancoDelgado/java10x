package NivelIntermediario.abstrato;

public class Main {
    public static void main(String[] args) {
        // Ninja generico = new Ninja(); -> Não é mais possível

        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", 17);
        Naruto.tecnicaJutsu();

        Uchiha Sasuke = new Uchiha("Sasuke Uchiha", 17);
        Sasuke.tecnicaJutsu();
    }
}
