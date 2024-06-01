package animal;
import animal.Gato;
import animal.Cachorro;

public class App {
    public static void main(String[] args) {
        Gato meuGato = new Gato("Frajola", 3);
        meuGato.comer();
        meuGato.emitirSom();

        Cachorro meuCachorro = new Cachorro("Labrador", 20);
        meuCachorro.comer();
        meuCachorro.emitirSom();
  }
}
