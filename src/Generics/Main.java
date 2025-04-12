package Generics;

public class Main {
    public static void main(String[] args) {

        EquipamentosNinja kunai = new EquipamentosNinja("Kunai");
        EquipamentosNinja espada = new EquipamentosNinja("Espada");
        EquipamentosNinja escudo = new EquipamentosNinja("Escudo");

        BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.adicionarEquipamento(kunai);
        bolsaGenerica.adicionarEquipamento(espada);
        bolsaGenerica.adicionarEquipamento(escudo);
        System.out.println(bolsaGenerica);


        BolsaNinja<EquipamentosNinja> bolsaNinja =  new BolsaNinja();
        bolsaNinja.adicionarItem(new EquipamentosNinja("Shuriken"));
        bolsaNinja.adicionarItem(new EquipamentosNinja("Pergaminho"));
        System.out.println(bolsaNinja);
        bolsaNinja.getItens();

        Joias anel = new Joias("Anel");
        Joias colar = new Joias("Colar");
        Joias pulseira = new Joias("Pulseira");
        Joias brinco = new Joias("Brinco");

        System.out.println("***************BOLSA DE JOIAS***************");
        BolsaDeJoias<Joias> bolsaJoias = new BolsaDeJoias<>();
        bolsaJoias.addItem(anel);
        bolsaJoias.addItem(colar);
        bolsaJoias.addItem(pulseira);
        bolsaJoias.addItem(brinco);

        System.out.println(bolsaJoias);
        bolsaJoias.getItens();

        System.out.println("***************CAIXA DE STRING***************");
        Caixa<String> caixaDeString = new Caixa<>("Caixa de String");
        System.out.println(caixaDeString.obter());
        caixaDeString.setarConteudo("Alterando a String");

        System.out.println("***************CAIXA DE INTEGER***************");
        Caixa<Integer> caixaInteger = new Caixa<>(1);
        System.out.println(caixaInteger.obter());
        caixaInteger.setarConteudo(2);

        System.out.println("**************obter maior valor tipo generico**************");
        System.out.println("Maior valor entre 5 e 10");
        System.out.println(obterMaior(5, 10));

        System.out.println("Maior valor entre JAVA e PYTHON");
        System.out.println(obterMaior("JAVA", "PYTHON"));

        System.out.println("Imprimindo array generico");
        String[] arrayStrings = new String[4];
        arrayStrings[0] = "Diego";
        arrayStrings[1] = "Roskana";
        arrayStrings[2] = "Cailania";
        arrayStrings[3] = "Camaro";

        imprimirArray(arrayStrings);
        System.out.println("");
        System.out.println(imprimirGenerico("Oin "));
        imprimirGenerico(5000L);
        imprimirGenerico(654654654F);
        imprimirGenerico("Naruto iamazaki");

    }
    public static <T extends Comparable<T>> T obterMaior(T valor1, T valor2){
        return(valor1.compareTo(valor2) > 0) ? valor1 : valor2;
    }

    public static <T> void imprimirArray(T[] array){
        for (T element : array){
            System.out.print(element + ", ");
        }
    }

    public static <T> T imprimirGenerico(T elemento){
        return elemento;
    }
}
