package Generics;

public class Caixa<T> {

    private T conteudo;

    public Caixa(T conteudo) {
        this.conteudo = conteudo;
    }

    T obter(){
        return conteudo;
    }

    void setarConteudo(T conteudo){
        this.conteudo = conteudo;
        System.out.println("Novo conteudo = " + conteudo);
    }
}
