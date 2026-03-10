package NivelIntermediario.multipla;

public class Main {
    public static void main(String[] args) {
        // OBJ Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 16;
        sasuke.aldeia = "Aldeia da folha";
        sasuke.ativarSharingan();


        // OBJ Hatake -> Herança multipla
        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi Hatake";
        kakashi.idade = 48;
        kakashi.aldeia = "Aldeia da folha";
        kakashi.ativarSharingan();
        kakashi.anbuMensagem();

        // OBJ Uzumaki -> não possui nenhum contrato
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", 16, "Aldeia da folha");
        System.out.println(naruto.nome);
    }
}
