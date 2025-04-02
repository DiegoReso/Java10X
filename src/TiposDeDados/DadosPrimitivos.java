package TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {

        int idade = 10;
        double preco = 4.5;
        float valor = 45.4F;
        double valorDouble = 4.55;
        boolean isEmpty = true;
        char caracter = 'A';
        Long numeroGigante = 6544655469987985475L;

        String nome = "Ninja mais rapido do oeste";

        //Nome Ninja 1
        String nomeNinja1 = "Naruto Uzumaki";
        Integer idadeNinja1 = 14;
        String missionNinja1 = "Andar sobre as aguas mortais";
        char nivelDificuldadeNinja1 = 'S';
        String statusConclusaoNinja1 = "Em andamento";

        System.out.println("O ninja 1 tem o nome de: " + nomeNinja1 + " com " + idadeNinja1 + " anos de idade, sua " + "missao " + "hoje eh de " +  missionNinja1 + " com dificuldade: " + nivelDificuldadeNinja1 + " e o status da missao eh: " + statusConclusaoNinja1);

        if(idadeNinja1 < 15 && nivelDificuldadeNinja1 != 'C' && nivelDificuldadeNinja1 != 'D'){
            System.out.println("Ninjas menores de 15 anos so podem concluir missoes C ou D");
            statusConclusaoNinja1 = "Missão nao concluida!";
        }else{
            System.out.println("Missao do ninja foi concluida!");
            statusConclusaoNinja1 = "Concluida";
        }

        System.out.println("\n**********TESTANDO IDADE******");
        System.out.println("O ninja 1 tem o nome de: " + nomeNinja1 + " com " + idadeNinja1 + " anos de idade, sua " + "missao " + "hoje eh de " +  missionNinja1 + " com dificuldade: " + nivelDificuldadeNinja1 + " e o status da missao eh: " + statusConclusaoNinja1);

    }
}
