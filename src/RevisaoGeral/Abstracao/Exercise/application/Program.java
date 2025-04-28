package RevisaoGeral.Abstracao.Exercise.application;

import RevisaoGeral.Abstracao.Exercise.entities.Pessoa;
import RevisaoGeral.Abstracao.Exercise.entities.PessoaFisica;
import RevisaoGeral.Abstracao.Exercise.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Pessoa> listPessoa = new ArrayList<>();

        System.out.print("Enter the number os tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char personType = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Annual Income: ");
            double income = sc.nextDouble();

            if(personType == 'i'){
                System.out.print("Medical Expense: ");
                double expense = sc.nextDouble();
                listPessoa.add(new PessoaFisica(name,income,expense));
            }else{
                System.out.print("Numbers of employees: ");
                int employee = sc.nextInt();

                listPessoa.add(new PessoaJuridica(name,income,employee));
            }
        }
        System.out.println("Taxes PAID");
        double sum = 0;
        for (Pessoa pessoa : listPessoa){
            sum += pessoa.calcTax();
            System.out.printf("%s : $ %.2f%n", pessoa.getName(), pessoa.calcTax());
        }
        System.out.println("Total Taxes: " + sum);
        sc.close();
    }
}
