package DesafioIntermediario;

import java.util.LinkedList;

public class ListaNinjas<T> {
    private LinkedList<T> ninjas;

    public ListaNinjas() {
        this.ninjas = new LinkedList<>();
    }

    public void deletarPrimeiroNinja(){
        ninjas.removeFirst();
    }

    public void adicionarNinjaPrimeiraPosicao(T ninja){
        ninjas.addFirst(ninja);
        for(T element :  ninjas){
            System.out.println(element);
        }
    }

    public T exibeNinja(int posicao){
        return ninjas.get(posicao);
    }

    public void getNinjas() {
        for (T ninja : ninjas){
            System.out.println(ninja.toString());
        }
    }

    public void setNinjas(T ninja) {
        ninjas.add(ninja);
    }
}
