package Enum;

public class Main {
    public static void main(String[] args) {

        Missoes missaoNinja = new Missoes("Tacar manga no vizinho", RankDeMissoes.A);
        missaoNinja.exibirDetalhes();

        Missoes missaoNinujaNarutio = new Missoes("Pegar martelo de desenpenar vidro", RankDeMissoes.S);
        missaoNinujaNarutio.exibirDetalhes();
        
    }
}
