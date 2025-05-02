package RevisaoGeral.geral;

import java.util.Scanner;

public class Debugando {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] alunos = {"Diego", "Cailania", "Roskana", "Charles"};

        double media = verificarMedia(alunos,scan);
        System.out.println("A media dos alunos foi: " + media);

    }

    static double verificarMedia(String[] alunos, Scanner scan){

        double soma = 0;
        for (String aluno : alunos){
            System.out.println("Entre com a nota do aluno " + aluno);
            double nota = scan.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;
    }
}
