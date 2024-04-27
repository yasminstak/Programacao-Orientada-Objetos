import java.util.Scanner;

public class App {

    static int[] vetor = new int[10];

    public static void preencherVetor() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite 10 números para preencher o vetor:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = input.nextInt();
        }
    }

    public static boolean buscarNumero(int numero) {
        for (int i = 0; i < 10; i++) {
            if (vetor[i] == numero) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        preencherVetor();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número para buscar no vetor:");
        int numeroParaBuscar = input.nextInt();
        boolean encontrado = buscarNumero(numeroParaBuscar);
        if (encontrado) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NAO ACHEI");
        }
    }
}
