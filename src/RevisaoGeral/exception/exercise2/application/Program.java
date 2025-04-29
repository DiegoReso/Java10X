package RevisaoGeral.exception.exercise2.application;

import RevisaoGeral.exception.exercise2.entities.Account;
import RevisaoGeral.exception.exercise2.entities.AccountException;

public class Program {
    public static void main(String[] args) {

        Account conta = new Account(3214,"Diego", 0.0, 100.0);

        try{
            conta.deposit(800.00);
            conta.withdraw(200.0);
        } catch (AccountException e) {
            System.out.println("Account error: " + e.getMessage());
        }

    }
}
