package veiculos;

public class Carro implements Veiculo {
    private String marca;
    private int velocidade;

    public Carro(String marca, int velocidade) {
        this.marca = marca;
        this.velocidade = velocidade;
    }

    // Getters e Setters
    // ...

    @Override
    public void acelerar() {
        System.out.println("Vrum vrum! O carro está acelerando!");
       
    }

    @Override
    public void frear() {
        System.out.println("Screech! O carro está freando!");
       
    }
}