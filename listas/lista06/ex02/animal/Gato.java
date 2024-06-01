package animal;

public class Gato implements Animal {
    private String nome;
    private int idade;

    public Gato(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public void comer() {
        System.out.println("O gato está comendo seu petisco favorito.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau! O gato está miando.");
    }
}

