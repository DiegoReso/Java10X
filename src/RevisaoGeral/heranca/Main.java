package RevisaoGeral.heranca;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BusinessAcount bAcc = new BusinessAcount(1002,"Cailania",0.0, 500.0);

        //upcasting
        Account acc1 = bAcc;
        Account acc2 = new BusinessAcount(1003, "Roskana", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004,"Camaro",0.0,0.01);

        //downcasting
        BusinessAcount acc4 = (BusinessAcount) acc2;
        acc4.loan(100.0);

        if(acc3 instanceof BusinessAcount){
            BusinessAcount acc5 = (BusinessAcount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan");
        }

        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }


        Account accSavings = new SavingsAccount(1011, "Diego", 1000.00, 0.01);

        accSavings.withDraw(200);
        System.out.println(accSavings.getBalance());

        Account accBusiness = new BusinessAcount(654654, "Taiwane", 1000.00, 10.0);

        accBusiness.withDraw(200);
        System.out.println(accBusiness.getBalance());

        //classe abstract
        List<Account> list = new ArrayList<>();
        list.add(new BusinessAcount(321, "Diego", 1000.00, 10.0));

        list.add(new SavingsAccount(123,"Cailania", 1500.00, 1.0));

        double sum = 0;

        for (Account acc : list){
            sum += acc.getBalance();
        }
        System.out.printf("Total balance: %.2f%n", sum);

        for (Account acc : list){
            acc.deposit(10);

            System.out.println(acc.getBalance());
        };

    }
}










































