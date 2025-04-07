package NivelBasico.TiposDeDados.Colecoes;

public class Array2 {
    public static void main(String[] args) {

        String[][] ninjasEAldeias = new String[3][3];
        ninjasEAldeias[0][0] = "Konaha 1";
        ninjasEAldeias[0][1] = "Konaha 2";
        ninjasEAldeias[0][2] = "Konaha 3";

        ninjasEAldeias[1][0] = "Folha 1";
        ninjasEAldeias[1][1] = "Folha 2";
        ninjasEAldeias[1][2] = "Folha 3";

        ninjasEAldeias[2][0] = "Nevoa 1";
        ninjasEAldeias[2][1] = "Nevoa 2";
        ninjasEAldeias[2][2] = "Nevoa 3";

        for (int i = 0; i < ninjasEAldeias.length; i++) {
            for (int j = 0; j < ninjasEAldeias.length; j++) {
                System.out.println("Aldeias: " + ninjasEAldeias[i][j]);
            }
        }
    }
}
