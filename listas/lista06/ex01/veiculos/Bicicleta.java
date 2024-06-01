package veiculos;
public class Bicicleta implements Veiculo {
    private String tipo;
    private int marcha;

    public Bicicleta(String tipo, int marcha) {
        this.tipo = tipo;
        this.marcha = marcha;
    }


    @Override
    public void acelerar() {
        System.out.println("Pedalando! A bicicleta está acelerando!");
        
    }

    @Override
    public void frear() {
        System.out.println("Freando! A bicicleta está diminuindo a velocidade!");
       
    }
}