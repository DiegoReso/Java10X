package RevisaoGeral.generics;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

    private List<T> list = new ArrayList<>();


    public void addValue(T value){
        list.add(value);
    }

    public T first(){
        if(list.isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        return list.getFirst();
    }

    public void print(){
        for (T item : list){
            System.out.println(item);
        }
    }
}
