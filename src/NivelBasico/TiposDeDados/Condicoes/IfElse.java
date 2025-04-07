package NivelBasico.TiposDeDados.Condicoes;

public class IfElse {

    public static void main(String[] args) {
        String nome = "Naruto Uzumaki";
        Integer idade = 9;
        boolean hakage = false;
        short numeroMissoes = 14;

        if(numeroMissoes > 10 && idade > 15){
            System.out.println("Rank: Jounnin!");
        } else if (numeroMissoes >= 10 && idade < 15) {
            System.out.println("Rank: Chunnin!");
        }else{
            System.out.println("Rank: Gennin!");
        }
    }
}
