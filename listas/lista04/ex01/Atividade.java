public class Atividade {
    private String nome;
    private String local;
    private String horario;

    public Atividade(String nome, String local, String horario) {
        this.nome = nome;
        this.local = local;
        this.horario = horario;
    }

    public void imprimirDados() {
        System.out.println("Nome da atividade: " + nome);
        System.out.println("Local: " + local);
        System.out.println("Horário: " + horario);
    }
}
