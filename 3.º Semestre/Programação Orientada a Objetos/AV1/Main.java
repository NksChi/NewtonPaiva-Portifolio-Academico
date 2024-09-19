public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Nicolas", "nicolaschi673@gmail.com", "123456", 3, 508);
        System.out.println(aluno.mostraAluno());
        System.out.println("");
        Professor professor = new Professor("Michelle", "michelle@newtonpaiva.com", "a1b2c3",
                80.0f, 40);
        System.out.println(professor.mostraProfessor());
    }
}