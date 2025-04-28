package RevisaoGeral.heranca.fixacaoHeranca.application;

import RevisaoGeral.heranca.entities.Employee;
import RevisaoGeral.heranca.entities.OutSourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numberEmployee  = sc.nextInt();
        sc.nextLine();

        List<Employee> employeeList = new ArrayList<>();

        for (int i = 1; i <= numberEmployee; i++) {
            System.out.println("Employee #" + i  + " data:");
            System.out.print("Outsourced (y/n)");
            char isOutSource = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if(isOutSource == 'y'){

                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                employeeList.add(new OutSourceEmployee(name, hours,valuePerHour,additionalCharge));

            }else{
                employeeList.add(new Employee(name,hours,valuePerHour));
            }
        }

        System.out.println("Payments:");
        for (Employee employee : employeeList){
            System.out.println(employee);
        }
    }
}
































