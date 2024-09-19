package br.com.newton.agenda;

public class Contato {
    private String nome;
    private String telefone;
    private String ddd;

    public void excluir(String nome){
        System.out.println("Ecluindo o contato: " +nome);
    }

    public void add(String add){
        System.out.println("Adicionando o contato: " + nome);
    }

    public String getNome(String nome){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDdd(String ddd){
        return this.ddd;
    }

    public void setDdd(String dd) {
        this.ddd = ddd;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

}
