import java.util.Scanner;

public class CalculadoraIdade {
    
    static int A = 2024;

   
    static int calcularIdade(int anoNascimento) {
        int idade = A - anoNascimento;
        return idade;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        int idade = calcularIdade(anoNascimento);
        System.out.println("Até o final de 2024 você terá " + idade + " anos.");
    }
}
