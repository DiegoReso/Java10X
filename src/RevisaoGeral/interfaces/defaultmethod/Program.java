package RevisaoGeral.interfaces.defaultmethod;

public class Program {
    public static void main(String[] args) {


        InterestService br = new BrazilInteresService(2.0);
        InterestService usa = new UsaInterestService(1.0);

        System.out.println("BR: " + br.payment(200,3));
        System.out.println("USA: " + usa.payment(200,3));


    }
}
