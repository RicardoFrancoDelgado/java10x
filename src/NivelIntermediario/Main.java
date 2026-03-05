package NivelIntermediario;

public class Main {
    public static void main(String[] args) {
        // Criar um novo ninja a partir do molde do objeto
        Ninja sasuke = new Ninja();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 17;
        sasuke.aldeia = "Aldeia da Folha";

        Ninja naruto = new Ninja();
        naruto.nome = "Naruto";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 16;

        System.out.println(sasuke);
        System.out.println(naruto);
    }
}
