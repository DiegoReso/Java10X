package RevisaoGeral.exerciseUML;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        String nameDepartment = sc.nextLine();
        System.out.println("Enter worker data");
        System.out.print("Name: ");
        String nameWorker = sc.nextLine();
        System.out.print("Level: ");
        String levelWorker = sc.nextLine();
        System.out.print("Base Salary: ");
        double baseSalaryWorker = sc.nextDouble();

        Worker worker = new Worker(nameWorker, WorkerLevel.valueOf(levelWorker.toUpperCase()), baseSalaryWorker, new Department(nameDepartment)) ;
        System.out.println("========================");
        System.out.print("How many contracts to this worker? ");
        Integer n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            System.out.println("Enter contract #"+ i + " data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate  = sdf1.parse(sc.next());
            System.out.print("Value per hour: ");
            double value = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int duration = sc.nextInt();

            worker.addContract(new HourContract(contractDate,value,duration));
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + month + "/" + year + ": " + worker.income(year,month));
    }
}
