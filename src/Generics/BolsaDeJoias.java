package Generics;

import java.util.LinkedList;

public class BolsaDeJoias<T> {
    private LinkedList<T> itens;

    public BolsaDeJoias() {
        this.itens = new LinkedList<>();
    }

    void addItem(T item){
        itens.add(item);
    }

    public void getItens() {
        for (T item : itens){
            System.out.println(item);
        }
    }

    public void setItens(LinkedList<T> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "BolsaDeJoias{" +
                "itens=" + itens +
                '}';
    }
}
