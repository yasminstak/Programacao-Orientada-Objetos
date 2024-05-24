package loja;

public class App {
    public static void main(String[] args) {
        Loja minhaLoja = new Loja("Super Loja", "Rua 25 de abril, 123");

        Produto produto1 = new Produto("Notebook", 3500.00, 10);
        Produto produto2 = new Produto("Smartphone", 1500.00, 20);
        Produto produto3 = new Produto("Tablet", 1200.00, 15);

        minhaLoja.adicionarProduto(produto1);
        minhaLoja.adicionarProduto(produto2);
        minhaLoja.adicionarProduto(produto3);

        System.out.println("Produtos disponíveis na " + minhaLoja.getNome() + ":");
        minhaLoja.listarProdutos();
    }
}
