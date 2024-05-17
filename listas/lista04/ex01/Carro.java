public class Carro {
    private String marca;
    private String modelo;
    private String cor;

    public Carro(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public void imprimirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
    }
}