package RevisaoGeral.geral;

public class Rectangle {

    Double widht;
    Double height;

    double area(){
        return widht * height;
    }

    double perimeter(){
        return 2 * (widht + height);
    }

    double diagonal(){
        return Math.sqrt(Math.pow(widht,2) + Math.pow(height, 2));
    }

    @Override
    public String toString() {
        return "Rectangle = " +
                "widht =" + widht +
                ", height=" + height;
    }
}
