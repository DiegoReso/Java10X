package RevisaoGeral.heranca;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Diego", 0.0);
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



    }
}
