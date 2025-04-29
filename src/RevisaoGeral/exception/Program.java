package RevisaoGeral.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //finally
        File file = new File("C:\\in.txt");
        Scanner scanner = null;

        try{
            scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }finally {
            if(scanner != null){
                scanner.close();
            }
            System.out.println("finally block executed");
        }


        //method1();
        System.out.println("End of program");

    }

    public static void method1(){
        System.out.println("********METHOD1 START****************");
        method2();
        System.out.println("********METHOD1 END****************");
    }

    public static void method2() {
        System.out.println("********METHOD2 START****************");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position");
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }

        System.out.println("********METHOD2 END****************");
        sc.close();
    }
}
