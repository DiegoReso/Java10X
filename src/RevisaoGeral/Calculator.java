package RevisaoGeral;

public class Calculator {

    //atributo estativo
    final static double PI = 3.14159;



    //metodos estaticos
    static double circumference(double radius){
        return 2.0 * PI * radius;
    }

    static double volume(double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
