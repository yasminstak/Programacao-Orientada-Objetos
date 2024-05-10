import java.util.Scanner;

public class ComparadorDePalavras {
    static Scanner scanner = new Scanner(System.in);

    static void compararPalavras(String palavra1, String palavra2) {
        if (palavra1.equals(palavra2)) {
            System.out.println("As palavras sao idênticas");
            return;
        } else if (palavra1.equalsIgnoreCase(palavra2)) {
            System.out.println("As palavras sao iguais ignorando maiúsculo e minúsculo");
            return;
        } else {
            System.out.println("As palavras sao diferentes");
        }
    }

    public static void main(String[] args) {
        System.out.println("Digite a primeira palavra:");
        String palavra1 = scanner.next();
        System.out.println("Digite a segunda palavra:");
        String palavra2 = scanner.next();
        
        compararPalavras(palavra1, palavra2);
    }
}

