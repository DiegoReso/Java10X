package Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {
    private List<T> itens;

    public BolsaNinja() {
        this.itens = new ArrayList<>();
    }

    void adicionarItem(T item){
        itens.add(item);
    }

    public void getItens() {
        for (T item : itens){
            System.out.println(item);
        }
    }

    public void setItens(List<T> itens) {
        this.itens = itens;
    }

    @Override
    public String toString(){
        return "Item ninja" + itens.toString();
    }
}
