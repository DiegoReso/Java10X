package Excecoes;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        try{
            int a = 0;
            int b = 10;

            int divisao = b / a ;
            System.out.println(divisao);
        } catch (ArithmeticException e) {
            System.out.println("MSG DE ERRO: " + e.getMessage());
        }

        try{
            String[] palavras = {"Diego", "Cailania", "Roskana"};
            int[] numeros = {1,2,3};
            System.out.println(numeros[2]);
            System.out.println(palavras[3]);
        } catch (Exception e) {
            System.out.println("MSG DE ERRO: " + e.getMessage());
        }finally {
            System.out.println("Finally sera executado sempre!");
            System.out.println("Usado geralmente para liberar recursos, fechar arquivos, conexoes com banco de dados e etc.");
        }

        //excecoes com throw
        try{
            validarIdade(50);
            validarIdade(10);
        } catch (Exception e) {
            System.out.println("Idade invalida: " + e.getMessage());
        }

        //execoes customizadas
        Banco banco = new Banco(500);

        try {
            banco.sacar(50);
        }catch (SaldoInsulficiente e){
            System.out.println("ERRO: " + e.getMessage());
        }

        //excecao verificada

        try{
            BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"));
            String linha = reader.readLine();
            System.out.println(linha);
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        //execao nao verificada
        String texto = null;
        //programa seria compilado mas daria erro na execucao
        //System.out.println(texto.length());

        //throw em metodos
        try{
            processarArquivo("arquivo.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch  (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void validarIdade(int idade){

        if(idade < 18){
            throw new IllegalArgumentException("Idade deve ser maior que 18");
        }

        System.out.println("Idade valida: " + idade);
    }
    //metodo com jogando excecao com 2 Excecoes encadeada
    static void processarArquivo(String caminho) throws FileNotFoundException, IOException{
        if(caminho == null || caminho.isEmpty()){
            throw new IOException("Caminho invalido");
        }

        File arquivo = new File(caminho);

        if(!arquivo.exists()){
            throw new FileNotFoundException("Arquivo nao encontrado");
        }

        System.out.println("Arquivo encontrado com sucesso!");
    }
}
