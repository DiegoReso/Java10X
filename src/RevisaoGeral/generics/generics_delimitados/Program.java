package RevisaoGeral.generics.generics_delimitados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Program {
    public static void main(String[] args) {

        //get/put
        List<Integer> myInts = Arrays.asList(1,2,3,4);
        List<Double> myDoubles = Arrays.asList(3.14,6.28);
        List<Object> myObjs = new ArrayList<>();

        copy(myInts, myObjs);
        listar(myObjs);
        copy(myDoubles,myObjs);
        listar(myObjs);

        //wildcard bounded
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        List<Rectangle> myRectangle = new ArrayList<>();
        myRectangle.add(new Rectangle(2.0, 4.5));
        myRectangle.add(new Rectangle(5.0, 7.5));


        System.out.println("Total area: " + totalArea(myShapes)) ;
        System.out.println("Total area: " + totalArea(myCircles));
        System.out.println("Total area: " + totalArea(myRectangle));

    }

    public static double totalArea(List<? extends Shape> list){
        double sum = 0.0;
        for (Shape s : list){
            sum += s.area();
        }

        return sum;
    }

    //covariancaia somente acesso, a lista de destino contravariancia, podemos adicionar e tal
    public static void copy(List<? extends Number> source, List<? super Number> target){
        for (Number number : source){
            target.add(number);
        }
    }

    public static void listar(List<?> list){
        for (Object item : list){
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
