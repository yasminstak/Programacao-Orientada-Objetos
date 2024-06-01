package animal;

public class Cachorro implements Animal {
    private String raca;
    private int peso;

    public Cachorro (String raca, int peso) {
        this.raca = raca;
        this.peso = peso;
    }



    
    @Override
    public void comer() {
        System.out.println("O cachorro está devorando sua ração.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au! O cachorro está latindo animadamente.");
    }
}