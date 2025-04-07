package NivelBasico.TiposDeDados.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        System.out.println("\n*******COM WHILE*********");
        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;


        while (numeroDeClones <= numeroMaximoDeClones){
            System.out.println("O naturo fez um clone das sombras " + numeroDeClones);
            numeroDeClones++;
        }


        System.out.println("\n*******COM FOR*********");
        for (int i = 1; i <= numeroMaximoDeClones; i++) {
            System.out.println("O naruto fez um clone das sombras " + i);
        }
    }
}
