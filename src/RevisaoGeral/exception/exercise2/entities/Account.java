package RevisaoGeral.exception.exercise2.entities;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double amount){
        balance += amount;
    }

    public void withdraw(Double amount) throws AccountException{

        if(balance == 0){
            throw new AccountException("Saldo atual da conta é: R$ "+ balance + " , saque nao permitido");
        } else if (amount > balance) {
            throw new AccountException("Valor para saque maior do que o disponivel na conta");
        }else if(amount > withdrawLimit){
            throw new AccountException("Valor para saque maior do que o permitido -> valor permitido para saque é de " + "R$ "  + withdrawLimit);
        }else{
            System.out.println("Seu anterior era: R$ " + balance);
            balance -= amount;
            System.out.println("Saque de " + amount + " realizado! Seu saldo atual eh: R$ " + balance);
        }
    }

    @Override
    public String toString() {
        return "Account: R$"
                + balance
                + " You are rich!";
    }
}
