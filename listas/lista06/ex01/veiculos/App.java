package veiculos;
import veiculos.Carro;
import veiculos.Bicicleta;

public class App {
   public static void main(String[] args) {
       Carro meuCarro = new Carro("Fiat", 0);
       Bicicleta minhaBicicleta = new Bicicleta("Mountain Bike", 3);

       meuCarro.acelerar();
       meuCarro.frear();

       minhaBicicleta.acelerar();
       minhaBicicleta.frear();
   }
}

