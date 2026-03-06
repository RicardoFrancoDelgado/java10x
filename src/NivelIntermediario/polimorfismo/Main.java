package NivelIntermediario.polimorfismo;

public class Main {
    public static void main(String[] args) {
        Gojo Satoro = new Gojo();
        Satoro.nome = "Satoro Gojo";
        Satoro.idade = 20;
        Satoro.escolhaJujutsu = true;

        String escola = Satoro.escolhaJujutsu ? "Sim" : "Não";
        System.out.println(Satoro.nome + " é da escola Jujutsu? " + escola);
        Satoro.HabilidadeEspecial();

        Zenin Naobito = new Zenin();
        Naobito.nome = "Naobito Zenin";
        Naobito.idade = 18;
        Naobito.escolhaJujutsu = false;
        escola = Naobito.escolhaJujutsu ? "Sim" : "Nao";
        System.out.println(Naobito.nome +  " é da escola Jujutsu? " + escola);
        Naobito.HabilidadeEspecial();
    }
}
