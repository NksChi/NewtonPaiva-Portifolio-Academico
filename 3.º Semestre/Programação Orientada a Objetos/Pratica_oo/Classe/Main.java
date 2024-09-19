package notas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Alunos aluno1 = new Alunos("João", "123", 20, 20, "Sistemas de Informação", 3);
        aluno1.avaliarAluno();
        aluno1.avaliarRecuperacao(80);
    }
}
