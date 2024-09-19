public class Empresa {
    private String nome;
    private String cnpj;
    private int qtdeDeFuncionarios;
    private Funcionario[] funcionarios;

    public Empresa(String nome, String cnpj, int qtdeDeFuncionarios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.qtdeDeFuncionarios = qtdeDeFuncionarios;
        this.funcionarios = new Funcionario[qtdeDeFuncionarios];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getQtdeDeFuncionarios() {
        return qtdeDeFuncionarios;
    }

    public void setQtdeDeFuncionarios(int qtdeDeFuncionarios) {
        this.qtdeDeFuncionarios = qtdeDeFuncionarios;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        for (int i = 0; i < this.qtdeDeFuncionarios; i++) {
            if (this.funcionarios[i] == null) {
                this.funcionarios[i] = funcionario;
                break;
            }
        }
    }

    public void listarFuncionarios() {
        for (Funcionario funcionario : this.funcionarios) {
            if (funcionario != null) {
                funcionario.mostrarDados();
            }
        }
    }


}
