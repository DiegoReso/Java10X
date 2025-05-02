package RevisaoGeral.geral;

import java.util.Date;
import java.util.Scanner;

public class OrientacaoObjetos {
    public static void main(String[] args) {
        //Enum
        ProdutoUsandoEnum produtoComEnum = new ProdutoUsandoEnum("Smart TV", OderStatusEnum.PROCESSING, new Date());

        System.out.println(produtoComEnum);

        OderStatusEnum os1 = OderStatusEnum.DELIVERED;
        System.out.println(os1);

        OderStatusEnum os2 = OderStatusEnum.valueOf("SHIPPED");
        System.out.println(os2);

        Scanner scanner = new Scanner(System.in);
        //ContaBancaria
        ContaBancaria conta1 = new ContaBancaria("1234", "Diego Reso");

        conta1.deposit(300.00);
        conta1.withdraw(100.00);
        System.out.println(conta1);

        ContaBancaria conta2 = new ContaBancaria("4321", "Cailania", 500.00);
        conta2.withdraw(50.00);
        conta2.withdraw(5.00);
        System.out.println(conta2);


        //ObjetoTeste
        ObjetoTeste objetoTeste = new ObjetoTeste();
        objetoTeste.setName("Diego");
        System.out.println(objetoTeste.getName());

        objetoTeste.setAge(35);
        System.out.println(objetoTeste.getAge());
        System.out.println(objetoTeste);

        //Student
        Student estudante = new Student();
        Double[] notas = {3.0, 3.0, 6.00, 5.00};

        estudante.adicionaNotas(notas);
        System.out.println(estudante.listaNotas);
        estudante.verificarNotas();


        //Employee
        Employee diego = new Employee();
        diego.name = "Diego Reis";
        diego.grossSalary = 6000.00;
        diego.tax = 1000.00;

        System.out.println(diego.netSalary());
        diego.increaseSalary(10);

        //Rectangle
        Rectangle retangulo = new Rectangle();
        retangulo.height = 3.0;
        retangulo.widht = 4.0;
        System.out.println(retangulo.area());
        System.out.println(retangulo.diagonal());
        System.out.println(retangulo.perimeter());



        //Product OOP
        Product tv = new Product();
        tv.name = "TV";
        tv.quantity = 10;
        tv.price = 900.00;

        System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f%n", tv.name, tv.price, tv.quantity, tv.totalValueStock());

        tv.addProducts(5);

        System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f%n", tv.name, tv.price, tv.quantity, tv.totalValueStock());

        tv.removeProducts(3);

        System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f%n", tv.name, tv.price, tv.quantity, tv.totalValueStock());

        System.out.println(tv);

        //solucao com orientacao a objetos
        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();

        x.a = 3.00;
        x.b = 4.00;
        x.c = 5.00;

        y.a = 7.50;
        y.b = 4.50;
        y.c = 4.02;

        double areaX = x.calcularArea();
        double areaY = y.calcularArea();

        System.out.println("Area do X -> " + areaX);
        System.out.println("Area do Y -> " + areaY);

//
//        //solucao sem orientacao a objetos
//        Scanner scanner = new Scanner(System.in);
//        double xA, xB, xC, yA, yB, yC;
//
//        System.out.println("Entre com os tres lados do triangulo X");
//        xA = scanner.nextDouble();
//        xB = scanner.nextDouble();
//        xC = scanner.nextDouble();
//
//        System.out.println("Entre com os tres lados do triangulo Y");
//        yA = scanner.nextDouble();
//        yB = scanner.nextDouble();
//        yC = scanner.nextDouble();
//
//        double xP = (xA + xB + xC) / 2;
//        double yP = (yA + yB + yC) / 2;

//        double areaX = Math.sqrt(xP * (xP - xA) * (xP - xB) * (xP - xC));
//        double areaY = Math.sqrt(yP * (yP - yA) * (yP - yB) * (yP - yC));

//        System.out.printf("Area do triangulo X = %.4f%n", areaX);
//        System.out.printf("Area do triangulo Y = %.4f%n ", areaY);
//
//        if (areaX > areaY){
//            System.out.println("Maior triangulo eh o triangulo X");
//        }else {
//            System.out.println("Maior triangulo eh o triangulo Y");
//        }
//
//        scanner.close();
    }
}
