public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Gladston", "gladston@empresa.com",
                "1111111111", "Financeiro",
                5000.00, "01/01/2020", "123456789");
        Funcionario f2 = new Funcionario("Felipe", "felipes@empresa.com",
                "2222222222", "Recursos Humanos",
                6000.00, "01/02/2020", "987654321");
        Funcionario f3 = new Funcionario("Edson", "edson@empresa.com",
                "3333333333", "TI",
                8000.00, "01/03/2020", "456789123");
        Funcionario f4 = new Funcionario("Arthur", "arthur@empresa.com",
                "4444444444", "Marketing",
                5500.00, "01/04/2020", "321654987");
        Funcionario f5 = new Funcionario("Eduardo", "eduardo@empresa.com",
                "5555555555", "Comercial",
                7000.00, "01/05/2020", "789456123");

        Empresa empresa = new Empresa("CT INTERPRISES", "123456789/0001-01", 100);
        empresa.adicionarFuncionario(f1);
        empresa.adicionarFuncionario(f2);
        empresa.adicionarFuncionario(f3);
        empresa.adicionarFuncionario(f4);
        empresa.adicionarFuncionario(f5);

        empresa.listarFuncionarios();
    }
}
