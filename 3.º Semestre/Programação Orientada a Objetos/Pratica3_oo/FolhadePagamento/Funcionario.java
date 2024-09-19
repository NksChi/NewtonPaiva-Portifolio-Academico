package br.com.pagamento.newton;

public abstract class Funcionario {
    private String nome;
    private String matricula;
    private double salarioFixo;

    public Funcionario(String nome, String matricula, double salarioFixo) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioFixo = salarioFixo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public abstract double calcularProventos();
}
