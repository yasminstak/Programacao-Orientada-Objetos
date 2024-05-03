import java.util.Scanner;

public class Exercicio1 {
    private static final int NUMERO_DE_PERGUNTAS = 3;
    private static final String[] GABARITO = {"a", "a", "a"};
    private static final Scanner SCAN = new Scanner(System.in);
    private static final String[] PERGUNTAS = {
        "Qual marca de carro produziu o modelo Mustang?",
        "Qual é a origem da marca de carro BMW?",
        "Qual é o país de origem da marca de carro Toyota?"
    };
    private static final String[][] OPCOES = {
        {"a) Ford", "b) Chevrolet", "c) Dodge"},
        {"a) Alemanha", "b) Itália", "c) França"},
        {"a) Japão", "b) Coreia do Sul", "c) China"}
    };

    public static void main(String[] args) {
        String nomeParticipante = receberNomeParticipante();
        comecarQuiz(nomeParticipante);
        for (int i = 0; i < NUMERO_DE_PERGUNTAS; i++) {
            fazerPergunta(i);
        }
    }

    public static String receberNomeParticipante() {
        System.out.println("Digite seu nome para começar:");
        return formatarNome(SCAN.nextLine());
    }

    public static String formatarNome(String nome) {
        if (nome.isBlank()) {
            return "NPC";
        }
        nome = nome.trim();
        String[] nomeCompleto = nome.split(" ");
        String primeiroNome = nomeCompleto[0];
        String primeiraLetraDoNome = String.valueOf(primeiroNome.charAt(0));
        String primeiroNomeSemInicial = primeiroNome.substring(1);
        String nomeFormatado = primeiraLetraDoNome.toUpperCase() + primeiroNomeSemInicial.toLowerCase();
        return nomeFormatado;
    }

    public static void comecarQuiz(String nomeParticipante) {
        System.out.println("Vamos começar, " + nomeParticipante + "!");
        System.out.println("Aperte ENTER para começar.");
        SCAN.nextLine();
    }

    public static void fazerPergunta(int numeroPergunta) {
        String pergunta = PERGUNTAS[numeroPergunta];
        String[] opcoes = OPCOES[numeroPergunta];
        String respostaCorreta = GABARITO[numeroPergunta];

        System.out.println(pergunta);
        for (String opcao : opcoes) {
            System.out.println(opcao);
        }

        System.out.print("Sua resposta: ");
        String respostaUsuario = SCAN.nextLine().toLowerCase();
        if (respostaUsuario.equals(respostaCorreta)) {
            System.out.println("Resposta correta!");
        } else {
            System.out.println("Resposta incorreta. A resposta correta é: " + respostaCorreta.toUpperCase());
        }
    }
}
