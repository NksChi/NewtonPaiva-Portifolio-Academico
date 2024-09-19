public class EmpregadoDaFaculdade{
    private final String nome;
    private final double salario;
    private final int horasAula;
    private double total;

            double getGastos(){
                this.total = this.horasAula * 40 + this.salario ;
                return this.total;
            }

            String getInfo(){
            return "Funcionario: " + this.nome + "\n" +
                    "Salário: R$" + this.salario + "\n" +
                    "Horas/aula: " + this.horasAula + "\n" +
                    "Salário com bonus : R$" + getGastos();
            }

    public EmpregadoDaFaculdade(String nome, double salario, int horasAula) {
        this.nome = nome;
        this.salario = salario;
        this.horasAula = horasAula;
    }
}
