package RevisaoGeral;

public class FuncoesString {
    public static void main(String[] args) {
        String original = "abcde FHGI ABC abc DEFG";

        System.out.println(original.toLowerCase());
        System.out.println(original.toUpperCase());
        System.out.println(original.trim());
        System.out.println(original.substring(6));
        System.out.println(original.substring(6,9));
        System.out.println(original.replace('a', 'x'));
        System.out.println(original.replace("abc","tata"));
        System.out.println(original.indexOf("bc"));

        String s = "potato apple lemon";

        String[] vect = s.split(" ");
        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

        System.out.printf("Palavras apos split %s, %s, %s ", word1, word2, word3);
    }
}
