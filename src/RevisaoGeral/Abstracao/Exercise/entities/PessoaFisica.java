package RevisaoGeral.Abstracao.Exercise.entities;

public class PessoaFisica extends Pessoa{

    private Double medicalExpense;

    public PessoaFisica() {

    }

    public PessoaFisica(String name, Double annualIncome, Double medicalExpense) {
        super(name, annualIncome);
        this.medicalExpense = medicalExpense;
    }

    @Override
    public double calcTax() {
        double sum = 0;

        if(annualIncome < 20000.00){
            return annualIncome * 0.15;
        }else{
            return (annualIncome * 0.25) - (medicalExpense * 0.50);
        }
    }

    public Double getMedicalExpense() {
        return medicalExpense;
    }

    public void setMedicalExpense(Double medicalExpense) {
        this.medicalExpense = medicalExpense;
    }
}
