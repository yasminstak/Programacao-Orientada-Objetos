package loja;

import java.util.ArrayList;

public class Loja {
    
    private String nome;
    private String endereco;
    private ArrayList<Produto> produtos;

    // Construtor com parâmetros
    public Loja(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.produtos = new ArrayList<>();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            produto.exibirDetalhes();
            System.out.println("----------");
        }
    }
}