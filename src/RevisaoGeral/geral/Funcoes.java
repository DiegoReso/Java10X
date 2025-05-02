package RevisaoGeral.geral;

public class Funcoes {
    public static void main(String[] args) {

        int a  = 24;
        int b  = 22;
        int c = 23;

        int higher = maxValue(a,b,c);

        showHigher(higher);

    }

    static int maxValue(int numero1, int numero2, int numero3){
        if(numero1 > numero2 && numero1 > numero3){
            return numero1;
        } else if (numero2 > numero3) {
            return numero2;
        }else{
            return numero3;
        }
    }

    static void showHigher(int numero){
        System.out.println("O maior numero inserido foi o numero: " + numero);
    }
}