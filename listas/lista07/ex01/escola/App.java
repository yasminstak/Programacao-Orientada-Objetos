import escola.Aluno;
import escola.Professor;

public class App {
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno("João Silva", "joao.silva@email.com", "A12345");
        
        Professor professor = new Professor("Maria Pereira", "maria.pereira@email.com", "Matemática");

        
        System.out.println("Informações do Aluno:");
        aluno.exibirInfo();
        System.out.println("\nInformações do Aluno (nome e matrícula):");
        aluno.exibirInfo(true, false, true);
        System.out.println("\nInformações do Aluno (email):");
        aluno.exibirInfo(false, true, false);

        System.out.println("\nInformações do Professor:");
        professor.exibirInfo();
        System.out.println("\nInformações do Professor (nome e disciplina):");
        professor.exibirInfo(true, false, true);
        System.out.println("\nInformações do Professor (email):");
        professor.exibirInfo(false, true, false);
    }
}
