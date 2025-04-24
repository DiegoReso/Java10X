package RevisaoGeral;

public class ContaBancaria {

    private final String contaBancaria;
    private String holder;
    private double balance;

    public ContaBancaria(String contaBancaria, String holder, double initDeposit) {
        this.contaBancaria = contaBancaria;
        this.holder = holder;
        deposit(initDeposit);
    }

    public ContaBancaria(String contaBancaria, String holder) {
        this.contaBancaria = contaBancaria;
        this.holder = holder;
    }

    public double getDepositValue() {
        return balance;
    }

    private void setDepositValue(double amount) {
        this.balance += amount;
    }

    void deposit(double amount){
        setDepositValue(amount);
    }

    void withdraw(double amount){
        this.balance -= (amount + 5.0);
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    @Override
    public String toString() {
        return "ContaBancaria: " +
                "contaBancaria: '" + contaBancaria + '\'' +
                ", holder= '" + holder + '\'' +
                ", balance =" + balance +
                '!';
    }
}
