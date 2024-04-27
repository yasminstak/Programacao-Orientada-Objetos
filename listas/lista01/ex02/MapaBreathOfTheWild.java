import java.util.Scanner;

public class MapaBreathOfTheWild {

    static boolean[][] mapa = new boolean[4][4];

    public static void preencherMapa() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mapa[i][j] = false;
            }
        }
    }

    public static void ativarTorre(int linha, int coluna) {
        mapa[linha][coluna] = true;
    }

    public static void imprimirMapa() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (mapa[i][j]) {
                    System.out.print("|O");
                } else {
                    System.out.print("|X");
                }
            }
            System.out.println("|");
        }
    }

    public static void main(String[] args) {
        preencherMapa();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a linha da torre a ser ativada:");
        int linhaTorre = input.nextInt();
        System.out.println("Digite a coluna da torre a ser ativada:");
        int colunaTorre = input.nextInt();
        ativarTorre(linhaTorre, colunaTorre);
        imprimirMapa();
    }
}