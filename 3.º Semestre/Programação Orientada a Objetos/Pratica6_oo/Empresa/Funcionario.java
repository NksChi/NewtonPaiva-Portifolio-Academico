public class Funcionario extends Pessoa {
    private String departamento;
    private double salario;
    private String dataEntrada;
    private String rg;
    private boolean estaNaEmpresa;

    public Funcionario(String nome, String email, String telefone, String departamento, double salario,
                       String dataEntrada, String rg) {
        super(nome, email, telefone);
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.rg = rg;
        this.estaNaEmpresa = true;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isEstaNaEmpresa() {
        return estaNaEmpresa;
    }

    public void setEstaNaEmpresa(boolean estaNaEmpresa) {
        this.estaNaEmpresa = estaNaEmpresa;
    }

    public void bonificar(double aumento) {
        this.salario += aumento;
    }

    public void demitir() {
        this.estaNaEmpresa = false;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("E-mail: " + this.email);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salário: " + this.salario);
        System.out.println("Data de entrada: " + this.dataEntrada);
        System.out.println("RG: " + this.rg);
        System.out.println("Está na empresa? " + (this.estaNaEmpresa ? "Sim" : "Não"));
    }

}
