package RevisaoGeral.Abstracao.Exercise.entities;

public class PessoaJuridica extends Pessoa{

    private Integer quantityEmployee;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String name, Double annualIncome, Integer quantityEmployee) {
        super(name, annualIncome);
        this.quantityEmployee = quantityEmployee;
    }

    @Override
    public double calcTax() {
        if(quantityEmployee > 10){
            return annualIncome * 0.14;
        }else{
            return  annualIncome * 0.16;
        }

    }

    public Integer getQuantityEmployee() {
        return quantityEmployee;
    }

    public void setQuantityEmployee(Integer quantityEmployee) {
        this.quantityEmployee = quantityEmployee;
    }


}
