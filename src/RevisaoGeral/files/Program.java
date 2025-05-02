package RevisaoGeral.files;

import java.io.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("==================");

        File file = new File("C:\\in.txt");
        Scanner sc = null;

        //pegando somente nome do arquivo
        File testandoNomeArquivo = new File("C:\\Users\\diego\\Documents\\workspace\\out.txt");
        //pegando somente nome do arquivo
        System.out.println(testandoNomeArquivo.getName());

        //pegando nome da pasta em que esse arquivo esta-
        System.out.println(testandoNomeArquivo.getParent());


        //folders
        System.out.print("Enter a folder path: ");
        String folderPath = new Scanner(System.in).nextLine();
        File pathF = new File(folderPath);
        //folders
        File[] folders = pathF.listFiles(File::isDirectory);
        System.out.println("Folder");
        for (File folder : folders){
            System.out.println(folder);
        }

        File[] filesOfFolder = pathF.listFiles(File::isFile);
        System.out.println("Files");
        for (File files : filesOfFolder){
            System.out.println(file);
        }

        boolean success = new File(folderPath + "\\subdir").mkdir();


        //writer
        String[] lines = {"Testando escrita", "Testando outra vez", "Cailebes Fronteira"};
        String pathWrite = "C:\\Users\\diego\\Documents\\workspace\\out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathWrite))){

            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        //file reader
        String path = "c:\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();

            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("==================");


        try{
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }finally {
            if(sc != null){
                sc.close();
            }

        }
    }
}
