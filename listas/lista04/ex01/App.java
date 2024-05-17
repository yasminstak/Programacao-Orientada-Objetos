public class App {
    public static void main(String[] args) {
    
        Atividade corrida = new Atividade("Maratona", "Parque da Cidade", "08:00");
        
        Carro meuCarro = new Carro("Toyota", "Corolla", "Prata");
        
        Pessoa pessoa1 = new Pessoa("Ana", 30, "Engenheira");

        corrida.imprimirDados();
        meuCarro.imprimirDados();
        pessoa1.imprimirDados();
    }
}