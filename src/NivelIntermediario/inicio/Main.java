package NivelIntermediario.inicio;

public class Main {
    public static void main(String[] args) {
        // Criar um novo ninja a partir do molde do objeto
        Ninja sasuke = new Ninja();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 17;
        sasuke.aldeia = "Aldeia da Folha";
        System.out.println(sasuke.nome);
        sasuke.SharinganAtivado();

        int quantoFalta = sasuke.seTornarHokage(60);
        System.out.println("Você tem " + sasuke.idade + " anos faltam " + quantoFalta + " anos para você se tornar um hokage");

        Ninja naruto = new Ninja();
        naruto.nome = "Naruto";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 16;
        System.out.println(naruto.nome);
        String mensagem = naruto.euSouUmNinja();
        System.out.println(mensagem);
        // problema 1: O naruto também pode ativar o sharingan
        naruto.SharinganAtivado();


    }
}
