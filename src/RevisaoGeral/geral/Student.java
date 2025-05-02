package RevisaoGeral.geral;

import java.util.ArrayList;
import java.util.List;

public class Student {

    String name;
    List<Double> listaNotas;

    void adicionaNotas(Double[] notas){
        listaNotas = new ArrayList<>();
        for (int i = 0; i < notas.length; i++) {
            listaNotas.add(notas[i]);
        }
    }

    void verificarNotas(){
        Double soma = 0.0;
        for (Double nota : listaNotas){
            soma += nota;
        }
        Double media = soma / listaNotas.size();
        System.out.println("A media do aluno foi -> " + media);

        if(media > 6.0){
            System.out.println("Aluno aprovado!");
        }else{
            System.out.println("Aluno reprovado!");
            System.out.println("Faltaram "  + (6.0 - media) + " pontos para ser aprovado!");
        }


    }
}
