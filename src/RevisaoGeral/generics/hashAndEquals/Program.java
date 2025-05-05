package RevisaoGeral.generics.hashAndEquals;

public class Program {
    public static void main(String[] args) {

        String a = "Maria";
        String b = "Alex";

        System.out.println(a.equals(b));

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());


        Cliente cliente1 = new Cliente("Diego", "diego@me");
        Cliente cliente2 = new Cliente("Diego", "diego@me");
        Cliente cliente3 = new Cliente("Alex", "alex@me");

        System.out.println(cliente1.hashCode());
        System.out.println(cliente2.hashCode());
        System.out.println(cliente3.hashCode());
        System.out.println(cliente1.equals(cliente2));

    }
}
