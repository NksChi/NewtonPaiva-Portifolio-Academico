package notas;

public class Alunos {
    private String nome;
    private String matricula;
    private double notaAv1, notaAv2, notaAve;
    private String curso;
    private int periodo;
    private double somanota;

    public Alunos(String nome, String matricula, double notaAv1, double notaAv2, String curso, int periodo) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAv1 = notaAv1;
        this.notaAv2 = notaAv2;
        this.curso = curso;
        this.periodo = periodo;
    }

    public void alterarAV1(double nota){
        this.notaAv1 = nota;
    }

    public void alterarAV2(double nota){
        this.notaAv2 = nota;
    }

    public void alterarAVE(double nota){
        this.notaAve = nota;
    }

    public void avaliarAluno() {
        somanota = this.notaAv1 + this.notaAv2;

        if (somanota >= 60) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno na recuperação!");
        }

    }

    public void avaliarRecuperacao(double notaAve){

        if(((somanota + notaAve)/2) >=60){
            System.out.println("Aluno aprovado!");
        }
        else{
            System.out.println("Aluno reprovado!");
        }

    }
}
