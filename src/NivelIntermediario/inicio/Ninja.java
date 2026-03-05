package NivelIntermediario.inicio;

public class Ninja {
    String nome;
    String aldeia;
    int idade;

    // Method void => não possui nenhum retorno, apenas executa uma ação
    public void SharinganAtivado() {
        System.out.println("O sharingan foi ativado");
    }

    /*
     * Definir methods com tipos obrigatóriamente exige que o retorno seja do mesmo tipo
     */
    public String euSouUmNinja() {
        return "Olá, eu sou um ninja";
    }

    /*
     * Methods com parâmetros
     */
    public int seTornarHokage(int idadeMinimaParaSeTornarHokage) {
        return idadeMinimaParaSeTornarHokage - idade;
    }
}
