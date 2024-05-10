import java.util.Scanner;

public class RottenTomatoes {
    static int[] A = new int[3]; 
    static Scanner scanner = new Scanner(System.in); 

    static void receberNotas() {
        System.out.println("Digite as notas dos críticos:");
        for (int i = 0; i < 3; i++) {
            A[i] = scanner.nextInt();
        }
    }

    static void calcularMedia() {
        int soma = 0;
        for (int nota : A) {
            soma += nota;
        }
        double media = soma / 3.0;
        System.out.println("A média do filme é: " + media);
    }

    
    public static void main(String[] args) {
        receberNotas(); 
        calcularMedia(); 
    }
}
