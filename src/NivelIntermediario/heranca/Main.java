package NivelIntermediario.heranca;

public class Main {
    public static void main(String[] args) {
        // Objeto 1
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 15;
        Naruto.ModoSabio();

        // Objeto 2
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 16;
        Sasuke.AtivarSharingan();

        // Objeto 3
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 16;
        Sakura.CuraAnormal();

        // Objeto 4
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.aldeia = "Aldeia da Folha";
        Hinata.idade = 14;
        Hinata.Byakugan();

        //Boruto
        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Hyuga Uzumaki";
        Boruto.aldeia = "Aldeia da Folha";
        Boruto.idade = 14;

        Boruto.ModoSabio();
        Boruto.AtivarJougan();
        Boruto.AtivarKarma();
    }
}
