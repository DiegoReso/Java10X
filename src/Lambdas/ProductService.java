package Lambdas;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {


    public double filteredSum(List<Produto> list, Predicate<Produto> criterio){

        double sum =0;

        for (Produto p : list){
            if(criterio.test(p)){
                sum += p.getPrice();
            }
        }

        return sum;
    }

}
