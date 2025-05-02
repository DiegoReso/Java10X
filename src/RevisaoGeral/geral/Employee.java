package RevisaoGeral.geral;

public class Employee {
    String name;
    Double grossSalary;
    Double tax;

    double netSalary(){
        return grossSalary - tax;
    }

    void increaseSalary(double percentage){
        this.grossSalary = netSalary() +  (this.grossSalary * percentage) /100;
        System.out.println("Salario aumentado em " + percentage + " por cento tirando a taxa de " + tax + " !");
        System.out.println("Seu salario total eh: " + grossSalary);
    }
}
