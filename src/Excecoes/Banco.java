package Excecoes;

public class Banco {

    private double saldo;

    public Banco(double saldo) {
        this.saldo = saldo;
    }

    void sacar(double valor) throws SaldoInsulficiente{
        if(valor > saldo){
            throw new SaldoInsulficiente("Saldo Insulficiente!");
        }
        saldo -= valor;
        System.out.println("Saque realizado com sucesso de " + valor + ", seu saldo atual eh de: " + saldo);
    }
}
