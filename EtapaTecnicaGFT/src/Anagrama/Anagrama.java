package Anagrama;
import java.util.Scanner;

public class Anagrama {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int[] letras1=new int[26];
        int[] letras2=new int[26];
        int n;
        String linha;

        n = ler.nextInt();
        linha = ler.nextLine();
        linha = ler.nextLine();
        for (int i = 0; i < n; i++) {
            char c = linha.charAt(i);
            if (c != ' ' && c != ',' && c != '.')
                letras1[(c - 'a')]++;
        }
        linha = ler.nextLine();
        for (int i = 0; i < n; i++) {
            char c = linha.charAt(i);
            if (c != ' ' && c != ',' && c != '.')
                letras2[(c - 'a')]++;
        }
        char res = 'S';
        for (int i = 0; i < 26; i++) {
            if (letras1[i] != letras2[i]) {
                res = 'N';
            }
        }
        System.out.println(res);

    }

}

