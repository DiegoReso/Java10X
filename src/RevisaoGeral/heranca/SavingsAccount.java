package RevisaoGeral.heranca;

//final previne que nenhuma outra classe herde de SavingsAccount
public final class SavingsAccount extends Account {
    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    void updateBalance(){
        balance += balance *interestRate;
    }

    @Override
    void withDraw(double amount) {
        balance -= amount;
    }
}
